package com.losy;

public class Main {

    public static void main(String[] args) {
        int b = 100_000_000;
        System.out.println(b);
        char a = 1;
        System.out.println(a);
        char c = '\u0001';
        System.out.println(c);
        char d = '1';
        System.out.println(d);
        System.out.println((short) d);
        byte e = 105;
        byte f = 1;
        e = e + f;
        System.out.println(e);
    }
}
