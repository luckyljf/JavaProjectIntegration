package com.ljf.strategy.pattern.before;

/**
 * @Author: ljf
 * @Create: 2022/3/8 23:05
 * @Description:
 **/
public class PekingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("北京鸭");
    }


    @Override
    public void swimming() {
        System.out.println("北京鸭不会游泳");
    }

    @Override
    public void call() {
        System.out.println("北京鸭不会叫");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔");
    }
}
