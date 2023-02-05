package com.losy;

public class Person {
    String name;
    int age;
    String sex;

    static String info;

    {
        System.out.println("我是代码块");
    }

    Person(String name, int age, String sex) {
        System.out.println("我是构造方法");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
