package com.youxiue.design.adapter.objAda;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/1 15:24
 */
public class Phone {



    public void charge(PowerAdapter powerAdapter){
        int out = powerAdapter.converter();
        if(out == 5){
            System.out.println("可以充电");
        } else {
            System.out.println("不能充电");
        }
    }

}
