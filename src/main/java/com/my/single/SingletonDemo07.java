package com.my.single;

/**
 * 终极版 （volatile）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo07 {

    private volatile static SingletonDemo07 singletonDemo07 = null;

    private SingletonDemo07() {
        System.out.println("I am 终极版");
    }

    public static SingletonDemo07 getInstance() {
        if (null == singletonDemo07) {
            synchronized (SingletonDemo07.class) {
                if (null == singletonDemo07) {
                    singletonDemo07 = new SingletonDemo07();
                }
            }
        }
        return singletonDemo07;
    }
}
