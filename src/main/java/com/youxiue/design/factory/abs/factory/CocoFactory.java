package com.youxiue.design.factory.abs.factory;

import com.youxiue.design.factory.abs.product.Fruit.CocoMtllFruit;
import com.youxiue.design.factory.abs.product.Fruit.CocoXcmmFruit;
import com.youxiue.design.factory.abs.product.Fruit.Fruit;
import com.youxiue.design.factory.abs.product.milkyTea.CocoMtwlMilkyTea;
import com.youxiue.design.factory.abs.product.milkyTea.CocoYzglMilkyTea;
import com.youxiue.design.factory.abs.product.milkyTea.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->CocoFactory
 * @description: TODO
 * @date: 2021/07/15 17:44
 */
public class CocoFactory implements AbsFactory {


    @Override
    public MilkyTea createMilkyTea(String type) {
        if (type.equals("yzgl")) {
            return new CocoYzglMilkyTea();
        } else if (type.equals("mtwl")) {
            return new CocoMtwlMilkyTea();
        } else {
            return null;
        }
    }

    @Override
    public Fruit createFruit(String type) {
        if (type.equals("mtll")) {
            return new CocoMtllFruit();
        } else if (type.equals("xcmm")) {
            return new CocoXcmmFruit();
        } else {
            return null;
        }
    }
}
