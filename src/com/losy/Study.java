package com.losy;

public interface Study {
    void study();

    default void test() {
        System.out.println("我是默认实现");
    }
}
