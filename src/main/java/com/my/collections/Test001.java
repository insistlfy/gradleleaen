package com.my.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Test001
 *
 * @author lfy
 * @date 2020/3/13
 **/
public class Test001 {


    public static void main(String[] args) {


        //HashMap 非线程安全 无序
        Map<String, Object> map = new HashMap<>(3);
        map.put(null, null);
        map.put(null, 11);
        map.put("1", null);
        System.out.println(map);

        //线程安全
        Map<String, Object> map1 = Collections.synchronizedMap(map);
        Map<String, Object> map2 = new ConcurrentHashMap<>();

        //HashTable 线程安全 不允许null key
        Map<String, Object> map3 = new Hashtable<>();
//        map3.put(null, "");
        System.out.println(map3);

        //有序
        Map<String, Object> map4 = new LinkedHashMap<>();

    }
}
