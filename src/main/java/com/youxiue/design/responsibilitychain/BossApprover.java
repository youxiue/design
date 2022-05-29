package com.youxiue.design.responsibilitychain;

/**
 * Created by xfb on 2022/05/29 18:44.
 */
public class BossApprover extends Approver {
    public BossApprover(String name) {
        super(name);
    }

    @Override
    public void purchaseRequest(PurchaseRequest purchaseRequest) {
        System.out.println("采购申请id: " + purchaseRequest.getId()
                + ", 审批资金：" + purchaseRequest.getPrice() + ", 审批人： " + this.getName());

    }
}
