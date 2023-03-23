package com.youxiue.design.factory.simple.factory;

import com.youxiue.design.factory.simple.product.MilkyTea;
import com.youxiue.design.factory.simple.product.MtwlMilkyTea;
import com.youxiue.design.factory.simple.product.YzglMilkyTea;

/**
 * @author: xfb
 * @projectName: design->MilkyTeaFactory
 * @description: 静态工厂模式
 * @date: 2021/07/13 17:48
 */
public class MilkyTeaFactory {

    public static MilkyTea createMilkyTea(String orderType) {
        if (orderType.equals("yzgl")) {
            return new YzglMilkyTea();
        } else if (orderType.equals("mtwl")) {
            return new MtwlMilkyTea();
        } else {
            return null;
        }
    }
}
