package com.ljf.interview;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author ljf
 * @date 2022/8/30 21:37
 * @Description
 */
public class HashMapUnSafeTest {

    public static void main(String[] args) {
        // 线程不安全,会导致异常:java.util.ConcurrentModificationException
        HashMap<String,String> hashMap = new HashMap();
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();// 线程安全

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
//                hashMap.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,8));
//                System.out.println(hashMap);
                concurrentHashMap.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,8));
                System.out.println(concurrentHashMap);
            }).start();
        }

    }
}
