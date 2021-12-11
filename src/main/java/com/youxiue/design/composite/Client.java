package com.youxiue.design.composite;

/**
 * 组合模式
 *
 * @author xfb
 * @date 2021/12/7 17:43
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent qinhua = new University("清华大学");

        OrganizationComponent dqOc = new College("电气工程学院");

        OrganizationComponent jsj = new College("计算机学院");
        qinhua.add(dqOc);
        qinhua.add(jsj);


        OrganizationComponent dz =  new Department("电子系");
        OrganizationComponent dq =  new Department("电气系");
        dqOc.add(dz);
        dqOc.add(dq);


        OrganizationComponent c =  new Department("C++系");
        OrganizationComponent java =  new Department("JAVA系");
        jsj.add(c);
        jsj.add(java);


        qinhua.print();

    }
}
