package com.ljf.interview;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author ljf
 * @date 2022/8/31 22:32
 * @Description 自旋锁
 */


public class SpinLockDemo {

    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": 加锁");

        while (!atomicReference.compareAndSet(null,thread)){
            System.out.println(thread.getName()+": 尝试获取锁");
        }

    }

    public void myUnLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": 解锁");
        atomicReference.compareAndSet(thread,null);

    }


    public static void main(String[] args) {

        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            spinLockDemo.myUnLock();
        },"AA").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            spinLockDemo.myUnLock();
        },"BB").start();
    }
}
