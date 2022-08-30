package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/30 19:16
 * @Description
 *
 * Volatile特性
 * 保证可见性  VolatileTest1
 * 不保证原子性 VolatileTest2,如何保证原子性,使用AtomicRe
 * 禁止指令重排序
 *
 */
public class VolatileTest1 {


    public static void main(String[] args) {
        MyData data = new MyData();
        new Thread(() -> {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            data.addTo60();
        }).start();

//        while (data.value1 == 0){
//
//        }
//        while (data.value2 == 0){
//
//        }

        System.out.println("主线程");
    }
}
