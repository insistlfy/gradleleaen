package com.my.string;

import java.lang.reflect.Field;

/**
 * TestString001
 *
 * @author lfy
 * @date 2020/3/25
 **/
public class TestString001 {

    public static void main(String[] args) {

        //**************************①**********************************//
        String a = "hello";

        //打印a的内存地址
        System.out.println("a的内存地址为 : " + System.identityHashCode(a));
        System.out.println(a);

        String b = "world";
        a += b;

        System.out.println("拼接后a的内存地址为 : " + System.identityHashCode(a));
        System.out.println("b的内存地址为 : " + System.identityHashCode(b));
        System.out.println(a);
        System.out.println(b);

        a = "你好";
        System.out.println("拼接后a的内存地址为 : " + System.identityHashCode(a));
        System.out.println(a);
        System.out.println("=========================================================");

        //*******************************②*****************************//

        //String真的不可变吗?

        String java = "java";
        System.out.println("修改前 : " + java);
        System.out.println("修改前的内存地址 : " + System.identityHashCode(java));

        try {
            //获取String中的value字段
            Field field = String.class.getDeclaredField("value");
            //改变value属性的访问权限
            field.setAccessible(true);
            //获取value属性的值
            char[] value = (char[]) field.get("java");
            value[0] = '?';
            System.out.println("修改后 : " + java);
            System.out.println("修改后的内存地址 : " + System.identityHashCode(java));
            System.out.println("=========================================================");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


        //*******************************③*****************************//

        // String trim() ?

        String str = " java  ";
        String str1 = str.trim();
        String str2 = "java";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str1);
        System.out.println(str1.length());
        //此处需关注trim()的源码
        System.out.println(str1 == str2);
        System.out.println("=========================================================");
    }
}
