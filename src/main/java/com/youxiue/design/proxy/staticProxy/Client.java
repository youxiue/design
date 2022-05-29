package com.youxiue.design.proxy.staticProxy;

/**
 * 静态代理
 * Created by xfb on 2021/12/11 23:12.
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(iTeacherDao);
        teacherDaoProxy.teach();
    }
}
