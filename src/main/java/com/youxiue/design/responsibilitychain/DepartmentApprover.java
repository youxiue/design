package com.youxiue.design.responsibilitychain;

/**
 * Created by xfb on 2022/05/29 18:44.
 */
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void purchaseRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() < 1000) {
            System.out.println("采购申请id: " + purchaseRequest.getId()
                    + ", 审批资金：" + purchaseRequest.getPrice() + ", 审批人： " + this.getName());
        } else {
            System.out.println(this.getName() + "没有权限");
            // 当前人审批不了则交给下一个人审批
            this.nextApprover.purchaseRequest(purchaseRequest);
        }
    }
}
