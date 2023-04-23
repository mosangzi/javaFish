package com.losy;

public class Worker extends Person {
    String name;

    public Worker(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    protected void exam() {
        System.out.println("参加高空证考试");
    }

    public void work() {
        System.out.println("我叫" + super.name + "，我在工作");
        System.out.println("我叫" + this.name + "，我在工作");
    }
}
