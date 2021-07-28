package com.youxiue.design.factory.abs.factory;

import com.youxiue.design.factory.abs.product.Fruit.Fruit;
import com.youxiue.design.factory.abs.product.milkyTea.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->AbsFactory
 * @description: TODO
 * @date: 2021/07/15 17:38
 */
public interface AbsFactory {

    MilkyTea createMilkyTea(String type);

    Fruit createFruit(String type);

}
