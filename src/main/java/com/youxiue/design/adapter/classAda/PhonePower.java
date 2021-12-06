package com.youxiue.design.adapter.classAda;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/26 16:29
 */
public class PhonePower extends HomePower implements PowerAdapter {


    /**
     * 220v电压不适合充电, 通过适配器接口转为手机电压
     * @return
     */
    @Override
    public int converter() {
        int out = super.out();
        out = out/44;
        System.out.println("手机充电器转换为" + out + "v电压");
        return out;
    }
}
