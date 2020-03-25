package com.my.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * table的length  哈希童的大小
 * Load factor 加载因子 0.75
 * threshold : length * Load factor 所能容纳的最大数据量,超过即扩容
 * size : 实际存在的键值对数量
 * @author lfy
 * @date 2020/3/25
 **/
public class TestMap001 {

    public static void main(String[] args) {
        Map<String,Object> test = new HashMap<>(16);

        test.put("1",1);
        test.put("2",2);
        System.out.println(test.size());
    }
}
