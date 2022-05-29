package com.youxiue.design.strategy;

/**
 * Created by xfb on 2022/05/29 17:14.
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫~");
    }
}
