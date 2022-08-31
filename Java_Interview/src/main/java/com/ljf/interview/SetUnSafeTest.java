package com.ljf.interview;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author ljf
 * @date 2022/8/30 21:37
 * @Description
 */
public class SetUnSafeTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // 线程不安全
        Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                copyOnWriteArraySet.add(UUID.randomUUID().toString().substring(0,8));
               System.out.println(copyOnWriteArraySet);
            }).start();
        }

    }
}
