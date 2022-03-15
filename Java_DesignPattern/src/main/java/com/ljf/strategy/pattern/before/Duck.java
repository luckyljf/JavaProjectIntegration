package com.ljf.strategy.pattern.before;

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
    public abstract void display();

    public void swimming(){
        System.out.println("鸭子在游泳");
    }

    public void call(){
        System.out.println("鸭子在叫");
    }


    public void fly(){
        System.out.println("鸭子在飞翔");
    }

}
