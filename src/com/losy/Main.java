package com.losy;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("小明", 18, "男");
        Student clone = (Student) student.clone();
        System.out.println(student);
        System.out.println(clone);
        System.out.println(student.hashCode());
        System.out.println(clone.hashCode());

    }
}

