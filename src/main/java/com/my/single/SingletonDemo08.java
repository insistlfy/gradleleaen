package com.my.single;

/**
 * 使用ThreadLocal实现单例模式（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo08 {

    private static final ThreadLocal<SingletonDemo08> singletonDemo08 = new ThreadLocal<SingletonDemo08>() {

        @Override
        protected SingletonDemo08 initialValue() {
            return new SingletonDemo08();
        }
    };

    private SingletonDemo08() {

    }

    public static SingletonDemo08 getInstance() {
        return singletonDemo08.get();
    }
}
