package com.my.single;

/**
 * 懒汉模式（线程不安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo01 {

    private static SingletonDemo01 singletonDemo01;

    private SingletonDemo01() {
        System.out.println("I am 懒汉模式（线程不安全）");
    }

    public static SingletonDemo01 getInstance() {
        if (null == singletonDemo01) {
            return new SingletonDemo01();
        }
        return singletonDemo01;
    }
}
