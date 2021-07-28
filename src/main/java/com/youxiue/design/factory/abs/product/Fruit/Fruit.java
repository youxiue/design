package com.youxiue.design.factory.abs.product.Fruit;

/**
 * @author: xfb
 * @projectName: design->Fruit
 * @description: TODO
 * @date: 2021/07/15 17:39
 */
public class Fruit {

    protected String name;

    public void prepare() {
        System.out.println(name + "准备材料");
    }

    public void brew() {
        System.out.println(name + "冲泡");
    }

    public void pack() {
        System.out.println(name + "打包");
    }
}
