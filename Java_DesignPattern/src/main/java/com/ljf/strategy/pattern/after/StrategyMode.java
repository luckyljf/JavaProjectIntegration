package com.ljf.strategy.pattern.after;

/**
 * @Author: ljf
 * @Create: 2022/1/21 15:06
 * @Description: StrategyMode 策略模式
 **/
public class StrategyMode {

    public static void main(String[] args) {

        IContext context = new IContext();
        context.display("野鸭子");
        context.setBehavior(new CallBehavior());
        context.execute();

    }
}
