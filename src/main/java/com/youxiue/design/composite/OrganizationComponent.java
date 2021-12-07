package com.youxiue.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组织机构
 *
 * @author xfb
 * @date 2021/12/7 15:41
 */
public abstract class OrganizationComponent {

    private String name;

    List<OrganizationComponent> subList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationComponent(String name) {
        subList = new ArrayList<>();
        this.name = name;
    }

    /**
     * 添加子组织方法
     * @param oc
     */
    void add(OrganizationComponent oc){
    }

    /**
     * 移除子组织方法
     */
    void remove(OrganizationComponent oc){
    }

    /**
     * 打印方法
     */
    abstract void print();


}
