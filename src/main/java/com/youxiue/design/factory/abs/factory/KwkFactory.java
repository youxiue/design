package com.youxiue.design.factory.abs.factory;

import com.youxiue.design.factory.abs.product.Fruit.Fruit;
import com.youxiue.design.factory.abs.product.Fruit.KwkMtllFruit;
import com.youxiue.design.factory.abs.product.Fruit.KwkXcmmFruit;
import com.youxiue.design.factory.abs.product.milkyTea.KwkMtwlMilkyTea;
import com.youxiue.design.factory.abs.product.milkyTea.KwkYzglMilkyTea;
import com.youxiue.design.factory.abs.product.milkyTea.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->KwkFactory
 * @description: TODO
 * @date: 2021/07/15 17:44
 */
public class KwkFactory implements AbsFactory {


    @Override
    public MilkyTea createMilkyTea(String type) {
        if (type.equals("yzgl")) {
            return new KwkYzglMilkyTea();
        } else if (type.equals("mtwl")) {
            return new KwkMtwlMilkyTea();
        } else {
            return null;
        }
    }

    @Override
    public Fruit createFruit(String type) {
        if (type.equals("mtll")) {
            return new KwkMtllFruit();
        } else if (type.equals("xcmm")) {
            return new KwkXcmmFruit();
        } else {
            return null;
        }
    }
}
