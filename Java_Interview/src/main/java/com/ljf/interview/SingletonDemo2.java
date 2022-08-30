package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/30 20:11
 * @Description DCL
 */
public class SingletonDemo2 {

    public static volatile SingletonDemo2 singletonDemo = null;

    public static SingletonDemo2 getInstance(){
        if (singletonDemo == null){
            synchronized (SingletonDemo.class){
                if (singletonDemo == null){
                    return new SingletonDemo2();
                }

            }
        }
        return singletonDemo;
    }

    public SingletonDemo2() {
        System.out.println(Thread.currentThread().getName()+"--- 我是无参构造方法:SingletonDemo");
    }
}
