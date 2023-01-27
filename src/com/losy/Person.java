package com.losy;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    String name;
    int age;
    String sex;

    void hello(){
        System.out.println("name: " + name + ", " + "age: " + age);
    }

    int sum(int a, int b){
        return a + b;
    }

    double sum(double a, double b){
        return a+b;
    }

    int test(int n){
        if (n == 0) {
            return 0;
        }
        return test(n-1)+n;
    }
}
