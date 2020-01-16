package com.my.single;

/**
 * 线程安全的懒汉模式（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo02 {
    private static SingletonDemo02 singletonDemo02;

    private SingletonDemo02() {
        System.out.println("I am 线程安全的懒汉模式（线程安全）");
    }

    public static synchronized SingletonDemo02 getInstance() {
        if (null == singletonDemo02) {
            return new SingletonDemo02();
        }
        return singletonDemo02;
    }

}
