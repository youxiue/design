package com.youxiue.design.factory.abs.product.milkyTea;

/**
 * @author: xfb
 * @projectName: design->MilkyTea
 * @description: TODO
 * @date: 2021/07/13 17:15
 */
public class MilkyTea {

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
