package com.my.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

/**
 * Test01
 *
 * @author lfy
 * @date 19-11-26
 **/
@Slf4j
public class Test01 {

    public static void main(String[] args) {
        log.info("CPU处理器的数量========>{}", Runtime.getRuntime().availableProcessors());
        log.info("parallelStream默认的并发线程数========>{}", ForkJoinPool.getCommonPoolParallelism());
        log.info("---------------------------------------------------------------------");

        List<Integer> values = new CopyOnWriteArrayList<>();
        IntStream.range(1, 10000).parallel().forEach(values::add);
        log.info("集合的大小===========>{}.", values.size());
        values.forEach(e -> log.info("集合中的元素=========>{}.", e));

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        IntStream.range(1, 10000).parallel().forEach(list::add);
        log.info("集合的大小===========>{}.", list.size());
        values.forEach(e -> log.info("集合中的元素=========>{}.", e));

        List list0 = Collections.EMPTY_LIST;
        List<String> list1 = Collections.emptyList();
        Map map0 = Collections.EMPTY_MAP;
        Map<String, Object> map1 = Collections.emptyMap();


        System.out.println(list0.size());
        System.out.println(list1.size());
        System.out.println(map0.size());

    }
}
