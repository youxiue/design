package com.youxiue.design.factory.abs;


import com.youxiue.design.factory.abs.factory.KwkFactory;

/**
 * @author: xfb
 * @projectName: design->FattyPerson
 * @description: TODO
 * @date: 2021/07/13 17:39
 */
public class FattyPerson {

    public static void main(String[] args) {
        new MilkyTeaOrder(new KwkFactory());
        //new MilkyTeaOrder(new CocoFactory());
    }
}
