package com.my.single;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用CAS锁实现（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public class SingletonDemo09 {

    private static final AtomicReference<SingletonDemo09> singletonDemo09 = new AtomicReference<>();

    private SingletonDemo09() {
        System.out.println("I am CAS ,线程安全");
    }

    public static final SingletonDemo09 getInstance() {
        for (; ; ) {
            SingletonDemo09 current = singletonDemo09.get();
            if (null != null) {
                return current;
            }
            current = new SingletonDemo09();
            if (singletonDemo09.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
