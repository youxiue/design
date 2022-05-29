package com.youxiue.design.strategy;

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
