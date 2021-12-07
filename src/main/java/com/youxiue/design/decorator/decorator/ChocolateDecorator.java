package com.youxiue.design.decorator.decorator;

import com.youxiue.design.decorator.Drink;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/6 11:26
 */
public class ChocolateDecorator extends Decorator {


    public ChocolateDecorator(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3);
    }
}
