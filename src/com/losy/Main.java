package com.losy;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("小明", 18, "男");
        Person.info = "hello";
        System.out.println(Person.info);
    }
}
