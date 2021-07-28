package com.youxiue.design.factory.method.factory;

import com.youxiue.design.factory.method.product.CocoMtwlMilkyTea;
import com.youxiue.design.factory.method.product.CocoYzglMilkyTea;
import com.youxiue.design.factory.method.product.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->CocoMilkyTeaFactory
 * @description: TODO
 * @date: 2021/07/13 17:51
 */
public class CocoMilkyTeaFactory extends MilkyTeaFactory {

    @Override
    public MilkyTea createMilkyTea(String orderType) {
        if (orderType.equals("yzgl")) {
            return new CocoYzglMilkyTea();
        } else if (orderType.equals("mtwl")) {
            return new CocoMtwlMilkyTea();
        } else {
            return null;
        }
    }
}
