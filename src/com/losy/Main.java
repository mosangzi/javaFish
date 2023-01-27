package com.losy;


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小明");
        System.out.println(person.name);
        System.out.println(person.sum(1, 2));
        System.out.println(person.sum(1.2, 1.3));
        System.out.println(person.sum(1.2, 1));
        System.out.println(person.test(3));
    }
}
