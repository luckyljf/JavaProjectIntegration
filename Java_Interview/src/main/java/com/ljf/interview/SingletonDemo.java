package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/30 20:11
 * @Description
 */
public class SingletonDemo {

    public static SingletonDemo singletonDemo = null;


    public static SingletonDemo getInstance(){
        if (singletonDemo == null){
            return new SingletonDemo();
        }
        return singletonDemo;
    }


    public SingletonDemo() {
        System.out.println(Thread.currentThread().getName()+"--- 我是无参构造方法:SingletonDemo");
    }
}
