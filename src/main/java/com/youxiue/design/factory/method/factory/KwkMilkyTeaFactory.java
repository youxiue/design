package com.youxiue.design.factory.method.factory;

import com.youxiue.design.factory.method.product.KwkMtwlMilkyTea;
import com.youxiue.design.factory.method.product.KwkYzglMilkyTea;
import com.youxiue.design.factory.method.product.MilkyTea;

/**
 * @author: xfb
 * @projectName: design->CocoMilkyTeaFactory
 * @description: TODO
 * @date: 2021/07/13 17:51
 */
public class KwkMilkyTeaFactory extends MilkyTeaFactory {

    @Override
    public MilkyTea createMilkyTea(String orderType) {
        if (orderType.equals("yzgl")) {
            return new KwkYzglMilkyTea();
        } else if (orderType.equals("mtwl")) {
            return new KwkMtwlMilkyTea();
        } else {
            return null;
        }
    }
}
