package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/30 19:16
 * @Description
 */
public class VolatileTest3 {


    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }
}
