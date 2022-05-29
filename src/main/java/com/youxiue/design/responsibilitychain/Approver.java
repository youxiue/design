package com.youxiue.design.responsibilitychain;

/**
 * 审批者
 * Created by xfb on 2022/05/29 18:41.
 */
public abstract class Approver {

    Approver nextApprover;

    /**
     * 审批人姓名
     */
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Approver getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void purchaseRequest(PurchaseRequest purchaseRequest);
}
