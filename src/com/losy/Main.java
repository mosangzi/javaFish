package com.losy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name = "word";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        int a  = 10;
        int b = a;
        a = 100;
        System.out.println(a==b);
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
        }
        System.out.println("---");
        Person alex = new Person("alex");
        Person mariam = alex;
        System.out.println(alex.name);
        alex.name = "Alexander";
        System.out.println(mariam);
        System.out.println(alex.name);
        System.out.println(alex == mariam);
    }
    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }
}
