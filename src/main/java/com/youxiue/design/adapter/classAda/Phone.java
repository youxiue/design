package com.youxiue.design.adapter.classAda;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/26 16:31
 */
public class Phone {

    /**
     * 充电方法, 需要提供一个 充电器
     * @param powerAdapter
     */
    public void charge(PowerAdapter powerAdapter) {
        System.out.println("手机充电");
        int out = powerAdapter.converter();
        if(out == 5){
            System.out.println("正在充电");
        } else {
            System.out.println("不适合充电");
        }
    }
}
