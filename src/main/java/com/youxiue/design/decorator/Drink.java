package com.youxiue.design.decorator;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/6 10:43
 */
public abstract class Drink {

    private String desc;

    private int price;

    public String getDesc() {
        return desc;
    }

    protected void setDesc(String desc) {
        this.desc = desc;
    }

    protected int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract int cost();

}
