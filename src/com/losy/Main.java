package com.losy;


public class Main {
    public static void main(String[] args) {
        Test test = new Test() {
            {
                name = "我是匿名内部类的初始化变量";
            }
        };
        System.out.println(test.getName());
    }
}

