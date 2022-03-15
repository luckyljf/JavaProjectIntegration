package com.ljf.strategy.pattern.before;

/**
 * @Author: ljf
 * @Create: 2022/3/8 23:07
 * @Description:
 **/
public class Test {


    public static void main(String[] args) {
        // 定义抽象类并定义鸭子的各种行为,子类继承并实现鸭子的各种特性
        // 野鸭子具备特性
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.call();
        wildDuck.fly();
        wildDuck.swimming();


        // 玩具鸭实现Duck抽象类,抽象类定义的方法无法使用,需要子列覆盖方法的实现
        // 代码臃肿,子类重写方法带来方法的不确定性
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.call();
        toyDuck.fly();
        toyDuck.swimming();
    }
}
