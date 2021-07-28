package com.youxiue.design.factory.abs;

import com.youxiue.design.factory.abs.factory.AbsFactory;
import com.youxiue.design.factory.abs.product.Fruit.Fruit;
import com.youxiue.design.factory.abs.product.milkyTea.MilkyTea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: xfb
 * @projectName: design->MilkyTeaOrder
 * @description: TODO
 * @date: 2021/07/13 17:24
 */
public class MilkyTeaOrder {

    public MilkyTeaOrder(AbsFactory absFactory) {

        String orderType = "";
        while (true) {
            orderType = getType();
            // 工厂方法模式
            MilkyTea milkyTea = absFactory.createMilkyTea(orderType);
            if (milkyTea != null) {
                milkyTea.prepare();
                milkyTea.brew();
                milkyTea.pack();
                continue;
            }
            Fruit fruit = absFactory.createFruit(orderType);
            if (fruit != null) {
                fruit.prepare();
                fruit.brew();
                fruit.pack();
            }

        }
    }

    /*private MilkyTea createMilkyTea(String orderType) {
        if (orderType.equals("yzgl")) {
            return new YzglMilkyTea();
        } else if (orderType.equals("mtwl")) {
            return new MtwlMilkyTea();
        }else {
            return null;
        }
    }
*/

    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
