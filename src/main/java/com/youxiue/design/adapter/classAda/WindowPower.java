package com.youxiue.design.adapter.classAda;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/26 16:40
 */
public class WindowPower extends HomePower implements PowerAdapter {


    @Override
    public int converter() {
        int out = super.out();
        out = out/11;
        System.out.println("电脑充电器转换为" + out + "v电压");
        return 0;
    }
}
