package com.ljf.interview;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author ljf
 * @date 2022/8/30 21:07
 * @Description
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {

        User zhangSan = new User("张三",11);
        User liSi = new User("李四",15);

        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(zhangSan);
        System.out.println(atomicReference.compareAndSet(zhangSan,liSi)+"   "+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(zhangSan,liSi)+"   "+atomicReference.get().toString());


    }
}
