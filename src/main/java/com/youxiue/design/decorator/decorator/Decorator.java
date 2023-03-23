package com.youxiue.design.decorator.decorator;

import com.youxiue.design.decorator.Drink;

/**
 * 小料
 *
 * @author xfb
 * @date 2021/12/6 14:20
 */
public abstract class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        // 当前 decorator 的价格 + drink 的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "|" + drink.getDesc();
    }
}
