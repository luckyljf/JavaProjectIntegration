package com.ljf.interview;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ljf
 * @date 2022/8/30 19:16
 * @Description
 */
public class MyData {

    int value1 = 0;
    volatile int value2 = 0;

    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void addTo60(){
        this.value1 = 60;
        this.value2 = 60;
    }

    public void addOne(){
        this.value2 ++;
    }

    public void atomicAddOne(){
        atomicInteger.getAndIncrement();
    }
}
