package com.youxiue.design.decorator.decorator;

import com.youxiue.design.decorator.Drink;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/6 11:18
 */
public class MilkDecorator extends Decorator {

    public MilkDecorator(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(5);
    }
}
