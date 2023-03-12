package com.losy;


public class Main {
    public static void main(String[] args) {
        Object p1 = new Student("小刚", 18, "男");
        Object p2 = new Student("小刚", 18, "男");
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);

        Person p3 = new Worker("小王", 25, "男");
        p3.test();
        Person p4 = new Student("小红", 16, "女");
        p4.test();
    }
}

