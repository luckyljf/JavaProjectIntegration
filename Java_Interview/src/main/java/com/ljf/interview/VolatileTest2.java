package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/30 19:16
 * @Description
 */
public class VolatileTest2 {


    public static void main(String[] args) {
        MyData data = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    data.addOne(); // 不保证原子性
                    data.atomicAddOne(); // 使用cas保证原子性
                }
            }).start();
        }

        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        System.out.println("result="+data.value2);
        System.out.println("result="+data.atomicInteger);
    }
}
