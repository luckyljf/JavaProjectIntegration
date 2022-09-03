package com.ljf.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author ljf
 * @date 2022/9/3 12:42
 * @Description
 * 写操作需要保证原子性, 需要保证A线程从开始写到写完成都要同时进行
 * 不加读写锁,则线程会抢夺资源,一个线程还未写完,其他线程就开始抢夺资源,造成写操作不一致
 */
public class ReentrantReadWriteLockDemo {

    public volatile Map<String, Object> map = new HashMap<>();
    public ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void write(String key ,Object object) {
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+": 开始写");
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(key,object);
            System.out.println(Thread.currentThread().getName()+": 写完成");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void read(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+": 开始读");
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(map.get(key));
            System.out.println(Thread.currentThread().getName()+": 读完成");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }


    }


    public static void main(String[] args) {
        ReentrantReadWriteLockDemo readWriteDemo = new ReentrantReadWriteLockDemo();
        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                readWriteDemo.write(String.valueOf(tempInt), UUID.randomUUID().toString().substring(0,8));
            },String.valueOf(i)).start();
        }


        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                readWriteDemo.read(String.valueOf(tempInt));
            },String.valueOf(i)).start();
        }
    }
}
