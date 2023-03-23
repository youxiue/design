package com.youxiue.design.strategy.examples.behavior.impl;

import com.youxiue.design.strategy.examples.behavior.FlyBehavior;

/**
 * Created by xfb on 2022/05/29 17:08.
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞行能力一级棒~");
    }
}
