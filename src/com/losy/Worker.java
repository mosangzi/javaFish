package com.losy;

public class Worker extends Person {
    String name;

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void work() {
        System.out.println("我叫" + super.name + "，我在工作");
        System.out.println("我叫" + this.name + "，我在工作");
    }
}
