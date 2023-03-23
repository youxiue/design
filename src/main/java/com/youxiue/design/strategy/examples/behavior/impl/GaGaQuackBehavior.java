package com.youxiue.design.strategy.examples.behavior.impl;

import com.youxiue.design.strategy.examples.behavior.QuackBehavior;

/**
 * Created by xfb on 2022/05/29 17:14.
 */
public class GaGaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎~");
    }
}
