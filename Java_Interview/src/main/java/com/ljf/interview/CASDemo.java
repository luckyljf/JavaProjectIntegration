package com.ljf.interview;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ljf
 * @date 2022/8/30 20:33
 * @Description
 */
public class CASDemo {


    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        new Thread(() -> {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程1:  "+atomicInteger.compareAndSet(5,20)+"  "+ atomicInteger.get());
        }).start();

        System.out.println("main:  "+atomicInteger.compareAndSet(5,10)+"  "+ atomicInteger.get());

    }
}
