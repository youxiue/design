package com.youxiue.design.strategy.examples;

import com.youxiue.design.strategy.examples.behavior.impl.GoodFlyBehavior;
import com.youxiue.design.strategy.examples.behavior.impl.NoQuackBehavior;

/**
 * Created by xfb on 2022/05/29 17:19.
 */
public class WildDuck extends Duck {

    public WildDuck() {
        super("野鸭");
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }
}
