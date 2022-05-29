package com.youxiue.design.strategy;

/**
 * Created by xfb on 2022/05/29 17:08.
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞行~");
    }
}
