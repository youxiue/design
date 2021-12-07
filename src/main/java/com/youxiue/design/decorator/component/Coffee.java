package com.youxiue.design.decorator.component;

import com.youxiue.design.decorator.Drink;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/6 10:55
 */
public abstract class Coffee extends Drink {


    @Override
    public int cost() {
        return getPrice();
    }
}
