package com.youxiue.design.composite;

/**
 * 部门
 *
 * @author xfb
 * @date 2021/12/7 17:06
 */
public class Department extends OrganizationComponent {

    public Department(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("---------" + getName());
    }
}
