package com.my.exception;

/**
 * Test001
 *
 * @author lfy
 * @date 2020/3/20
 **/
public class Test001 {


    public static String test01() {

        String str = "hello";
        try {
            System.out.println(str);
            str = "world";
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            str = "final";
        }
        return str;
    }

    public static String test02() {
        String str = "hello";

        try {
            System.out.println(str);
            str = "world";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("final");
            str = "final";
        }
        return str;
    }

    public static int test03() {
        int i = 1;

        try {
            System.out.println("hello");
            return ++i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("final");
            ++i;
        }
        return i;
    }

    public static int test04() {
        int i = 1;

        try {
            System.out.println("hello");
            return i++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("final");
            ++i;
        }
        return i;
    }

    public static int test05() {
        int i = 1;

        try {
            System.out.println("hello");
            int j = 11 / 0;
            return i++;
        } catch (Exception e) {
            e.printStackTrace();
            return ++i;
        } finally {
            System.out.println("final");
            ++i;
        }
    }

    public static int test06() {
        int i = 1;

        try {
            System.out.println("hello");
            return ++i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("final");
            ++i;
            i++;
            return i;
        }
    }

    public static int test07() {
        int i = 1;
        return i++;
    }

    public static int test08() {
        int i = 1;
        return ++i;
    }

    public static void main(String[] args) {
        System.out.println("TEST-01====>" + test01());
        System.out.println("=================================================");
        System.out.println("TEST-02====>" + test02());
        System.out.println("=================================================");
        System.out.println("TEST-03====>" + test03());
        System.out.println("=================================================");
        System.out.println("TEST-04====>" + test04());
        System.out.println("=================================================");
        System.out.println("TEST-05====>" + test05());
        System.out.println("=================================================");
        System.out.println("TEST-06====>" + test06());
        System.out.println("=================================================");
        System.out.println("TEST-07====>" + test07());
        System.out.println("=================================================");
        System.out.println("TEST-08====>" + test08());
    }
}
