package com.losy;

public class Student extends Person implements Study, Cloneable {
    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    protected void exam() {
        System.out.println("参加数学考试");
    }


    @Override
    public void study() {
        System.out.println("学习数学");
    }

    @Override
    public void test() {
        System.out.println("我是学生类的test实现");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
