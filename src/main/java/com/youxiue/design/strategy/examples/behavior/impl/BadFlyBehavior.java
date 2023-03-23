package com.youxiue.design.strategy.examples.behavior.impl;

import com.youxiue.design.strategy.examples.behavior.FlyBehavior;

/**
 * Created by xfb on 2022/05/29 17:08.
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞行能力不太行~");
    }
}
