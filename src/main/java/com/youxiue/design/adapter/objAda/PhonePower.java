package com.youxiue.design.adapter.objAda;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/26 16:46
 */
public class PhonePower implements PowerAdapter {

    private HomePower homePower;

    public PhonePower(HomePower homePower) {
        this.homePower = homePower;
    }

    @Override
    public int converter() {
        int out = homePower.out();
        out = out/44;
        System.out.println("输出"+out+"v电压");
        return out;
    }
}
