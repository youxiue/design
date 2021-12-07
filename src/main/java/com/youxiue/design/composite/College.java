package com.youxiue.design.composite;

/**
 * 院校
 *
 * @author xfb
 * @date 2021/12/7 15:39
 */
public class College extends OrganizationComponent {


    public College(String name) {
        super(name);
    }

    @Override
    void add(OrganizationComponent oc) {
        super.subList.add(oc);
    }

    @Override
    void remove(OrganizationComponent oc) {
        super.subList.remove(oc);
    }

    @Override
    void print() {
        System.out.println("----" + getName());
        super.subList.forEach(OrganizationComponent::print);
    }
}
