package com.youxiue.design.decorator;

import com.youxiue.design.decorator.component.IceCoffee;
import com.youxiue.design.decorator.component.LatteCoffee;
import com.youxiue.design.decorator.decorator.ChocolateDecorator;
import com.youxiue.design.decorator.decorator.MilkDecorator;

/**
 * 装饰者模式
 *
 * @author xfb
 * @date 2021/12/6 11:16
 */
public class Client {

    public static void main(String[] args) {

        // 冰咖啡
        Drink drink = new IceCoffee();
        int cost = drink.cost();
        System.out.println(drink.getDesc() + "价格:"+ cost);

        // 加上牛奶
        drink = new MilkDecorator(drink);
        cost = drink.cost();
        System.out.println(drink.getDesc() + "价格:"+ cost);

        // 加上巧克力
        drink = new ChocolateDecorator(drink);
        cost = drink.cost();
        System.out.println(drink.getDesc() + "价格:"+ cost);


        // 加上牛奶
        drink = new MilkDecorator(drink);
        cost = drink.cost();
        System.out.println(drink.getDesc() + "价格:"+ cost);


        // 加上巧克力
        drink = new ChocolateDecorator(drink);
        cost = drink.cost();
        System.out.println(drink.getDesc() + "价格:"+ cost);


        // 拿铁
        Drink latte = new LatteCoffee();
        cost = latte.cost();
        System.out.println(latte.getDesc() + "价格:"+ cost);
        latte = new MilkDecorator(latte);
        cost = latte.cost();
        System.out.println(latte.getDesc() + "价格:"+ cost);
    }
}
