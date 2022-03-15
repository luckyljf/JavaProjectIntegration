package com.ljf.strategy.pattern.before;

/**
 * @Author: ljf
 * @Create: 2022/3/8 23:07
 * @Description:
 **/
public class ToyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }


    @Override
    public void swimming() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void call() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔");
    }
}
