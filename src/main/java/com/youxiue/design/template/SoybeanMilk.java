package com.youxiue.design.template;

/**
 * Created by xfb on 2021/12/13 22:49.
 */
public abstract class  SoybeanMilk {

    /**
     * 制作豆浆
     *
     * 模板方法
     */
    public final void make() {
        select();
        if (isBurdening()) {
            burdening();
        }
        soak();
        polish();
    }

    /**
     * 选料
     */
    public void select() {
        System.out.println("精选高山金品黄豆");
    }

    /**
     * 加入配料
     */
    abstract void burdening();

    public void soak() {
        System.out.println("浸泡七七二十四小时");
    }

    /**
     * 打磨豆浆
     */
    public void polish() {
        System.out.println("九阳牌豆浆机精致打磨");
    }

    /**
     * 钩子函数
     * 是否加入配料
     *
     * @return
     */
    public boolean isBurdening() {
        return true;
    }
}
