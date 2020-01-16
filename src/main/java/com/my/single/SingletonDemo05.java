package com.my.single;

/**
 * 枚举方法（线程安全）
 *
 * @author lfy
 * @date 2020/1/16
 **/
public enum SingletonDemo05 {
    /**
     * INSTABCE
     */
    INSTABCE;

    public void print() {
        System.out.println("I am enum ,线程安全");
    }
}
