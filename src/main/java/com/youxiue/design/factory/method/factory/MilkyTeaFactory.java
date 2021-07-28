package com.youxiue.design.factory.method.factory;

import com.youxiue.design.factory.method.product.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->MilkyTeaFactory
 * @description: TODO
 * @date: 2021/07/13 17:48
 */
public abstract class MilkyTeaFactory {

    public abstract MilkyTea createMilkyTea(String orderType);
}
