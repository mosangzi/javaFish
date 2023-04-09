package com.losy;

public class Student extends Person {
    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    protected void exam() {
        System.out.println("数学考试");
    }
}
