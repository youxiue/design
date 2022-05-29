package com.youxiue.design.responsibilitychain;

/**
 * 采购申请
 * Created by xfb on 2022/05/29 18:35.
 */
public class PurchaseRequest {

    private int id;

    /**
     * 价格
     */
    private Float price = 0.0f;

    /**
     * 类型
     */
    private String type;

    public PurchaseRequest(int id, Float price, String type) {
        this.id = id;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
