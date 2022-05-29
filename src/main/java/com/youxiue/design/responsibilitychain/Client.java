package com.youxiue.design.responsibilitychain;

import java.util.ArrayList;

/**
 * 责任链模式
 *      为请求创建一个接收者对象的链, 这种模式对请求的发送者和接收者进行解耦
 *      责任链模式通常每个接收者都包含对另一个接收者的引用, 如果一个对象不能处理该请求, 那么它会把相同的请求传给下一个接收者, 以此类推
 *
 * 将请求与处理分开,实现解耦, 提高系统的灵活性
 * 注意:
 *  1. 性能会受到影响, 特别是链比较长的时候, 因此需要控制链中最大节点的数量.
 *     一般通过在handle中设置一个最大节点数量, 在 setNext() 方法中判断是否已经超过阈值, 超过则不允许该链建立, 避免出现超长链无意识的破坏系统性能.
 *  2. 调试不方便, 采用了类似递归的方式, 调试时逻辑可能比较复杂
 *
 * 应用场景: 有多个对象可以处理同一个请求时, 比如多级请求, 请假/加薪等审批流程, JavaWeb中的Tomcat对Encoding的处理, 拦截器
 * Created by xfb on 2022/05/29 17:51.
 */
public class Client {

    public static void main(String[] args) {

        // 审批成员
        Approver departmentApprover = new DepartmentApprover("张组长");
        Approver managerApprover = new ManagerApprover("刘经理");
        Approver bossApprover = new BossApprover("王总");

        departmentApprover.setNextApprover(managerApprover);
        managerApprover.setNextApprover(bossApprover);


        // 审批单
        PurchaseRequest p1 = new PurchaseRequest(1, 500f, "水果");
        PurchaseRequest p2 = new PurchaseRequest(2, 1000f, "办公用品");
        PurchaseRequest p3 = new PurchaseRequest(3, 12000f, "电脑");

        ArrayList<PurchaseRequest> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (PurchaseRequest purchaseRequest : list) {
            departmentApprover.purchaseRequest(purchaseRequest);
        }

    }

}
