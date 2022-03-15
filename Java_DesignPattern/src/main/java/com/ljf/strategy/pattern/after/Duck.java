package com.ljf.strategy.pattern.after;

/**
 * @Author: ljf
 * @Create: 2022/3/8 23:03
 * @Description:
 **/
public abstract class Duck {

    public Duck() {
    }

    /**
     * 显示不同类型的鸭子
     */
    public void display(String name){
        System.out.println(name);
    }

}
