package com.my.single;

/**
 * 静态类内部加载（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo04 {

    private static class SingleHolder {
        private static SingletonDemo04 singletonDemo04 = new SingletonDemo04();
    }

    private SingletonDemo04() {
        System.out.println("I am 静态类内部加载（线程安全）");
    }

    public static SingletonDemo04 getInstance() {
        return SingletonDemo04.SingleHolder.singletonDemo04;
    }
}
