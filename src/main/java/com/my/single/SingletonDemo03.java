package com.my.single;

/**
 * 饿汉模式（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo03 {

    private static SingletonDemo03 singletonDemo03 = new SingletonDemo03();

    private SingletonDemo03() {
        System.out.println("I am 饿汉模式（线程安全） ");
    }

    public static SingletonDemo03 getInstance() {
        return singletonDemo03;
    }
}
