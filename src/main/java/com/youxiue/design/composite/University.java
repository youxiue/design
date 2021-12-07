package com.youxiue.design.composite;

/**
 * 大学
 *
 * @author xfb
 * @date 2021/12/7 15:37
 */
public class University extends OrganizationComponent {

    public University(String name) {
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
        System.out.println(getName());
        super.subList.forEach(OrganizationComponent::print);
    }
}
