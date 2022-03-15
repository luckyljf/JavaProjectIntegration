package com.ljf.strategy.pattern.after;

/**
 * @Author: ljf
 * @Create: 2022/3/15 18:38
 * @Description:
 **/
public class SwimmingBehavior implements IBehavior{
    @Override
    public void behavior() {
        System.out.println("鸭子在游泳");
    }
}
