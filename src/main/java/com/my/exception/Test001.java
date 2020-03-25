package com.my.exception;

/**
 * Test001
 *
 * @author lfy
 * @date 2020/3/20
 **/
public class Test001 {


    private static String test() {

        String str = "";
        try {
            str = "test";
            return str;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            str = "final";
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println("TEST====>" + test());
    }
}
