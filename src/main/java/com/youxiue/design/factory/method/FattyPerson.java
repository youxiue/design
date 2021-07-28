package com.youxiue.design.factory.method;


import com.youxiue.design.factory.method.factory.KwkMilkyTeaFactory;

/**
 * @author: xfb
 * @projectName: design->FattyPerson
 * @description: TODO
 * @date: 2021/07/13 17:39
 */
public class FattyPerson {

    public static void main(String[] args) {
        //new MilkyTeaOrder(new CocoMilkyTeaFactory());
        new MilkyTeaOrder(new KwkMilkyTeaFactory());
    }
}
