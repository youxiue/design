package com.youxiue.design.strategy.examples;

import com.youxiue.design.strategy.examples.behavior.impl.BadFlyBehavior;
import com.youxiue.design.strategy.examples.behavior.impl.GaGaQuackBehavior;

/**
 * Created by xfb on 2022/05/29 17:19.
 */
public class BeijingDuck extends Duck {

    public BeijingDuck() {
        super("北京鸭");
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }
}
