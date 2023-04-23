package com.losy;

public class Teacher extends Person implements Study {

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    protected void exam() {
        System.out.println("参加教师资格证考试");
    }

    @Override
    public void test() {
        System.out.println("我是教师类的test实现");
    }

    @Override
    public void study() {
        System.out.println("练习普通话");
    }

}
