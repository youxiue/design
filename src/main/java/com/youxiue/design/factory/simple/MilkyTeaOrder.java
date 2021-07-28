package com.youxiue.design.factory.simple;

import com.youxiue.design.factory.simple.factory.MilkyTeaFactory;
import com.youxiue.design.factory.simple.product.MilkyTea;

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

    public MilkyTeaOrder() {

        String orderType = "";
        while (true) {
            orderType = getType();
            // 静态工厂模式
            MilkyTea milkyTea = MilkyTeaFactory.createMilkyTea(orderType);
            if (milkyTea == null) {
                System.out.println("没有这种茶!");
                continue;
            }
            milkyTea.prepare();
            milkyTea.brew();
            milkyTea.pack();
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
