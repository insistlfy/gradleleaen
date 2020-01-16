package com.my.single;

/**
 * 双重校验锁法（通常线程安全，低概率不安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo06 {

    private static SingletonDemo06 singletonDemo06;

    private SingletonDemo06() {
        System.out.println("I am 双重校验锁法（通常线程安全，低概率不安全）");
    }

    public static SingletonDemo06 getInstance() {
        if (null == singletonDemo06) {
            synchronized (SingletonDemo06.class) {
                if (null == singletonDemo06) {
                    singletonDemo06 = new SingletonDemo06();
                }
            }
        }
        return singletonDemo06;
    }
}
