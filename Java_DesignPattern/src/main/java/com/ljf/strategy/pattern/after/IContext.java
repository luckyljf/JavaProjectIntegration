package com.ljf.strategy.pattern.after;


/**
 * @Author: ljf
 * @Create: 2022/3/15 18:40
 * @Description:
 **/
public class IContext extends Duck{

    private IBehavior behavior;

    public IContext() {
    }

    public void execute(){
        behavior.behavior();
    }

    public IBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(IBehavior behavior) {
        this.behavior = behavior;
    }

}
