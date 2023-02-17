package com.losy;


public class Main extends Object {
    public static void main(String[] args) {
        Worker w1 = new Worker("小刚", 18, "男");
        Worker w2 = w1;
        System.out.println(w1.equals(w2));
        Worker w3 = new Worker("小明", 11, "男");
        System.out.println(w3.equals(w1));
        Worker w4 = new Worker("小刚", 18, "男");
        System.out.println(w4.equals(w1));
        System.out.println(w1.toString());
    }
}
