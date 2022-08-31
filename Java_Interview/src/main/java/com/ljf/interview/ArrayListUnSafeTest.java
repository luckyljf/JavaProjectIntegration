package com.ljf.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ljf
 * @date 2022/8/30 21:37
 * @Description
 */
public class ArrayListUnSafeTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                copyOnWriteArrayList.add(UUID.randomUUID().toString().substring(0,8));
               System.out.println(copyOnWriteArrayList);
            }).start();
        }

    }
}
