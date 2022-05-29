package com.youxiue.design.proxy.cglib;

/**
 * Created by xfb on 2021/12/11 23:36.
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherProxyFactory proxyFactory = new TeacherProxyFactory(teacherDao);
        TeacherDao teacherProxy = (TeacherDao)proxyFactory.getProxyInstance();
        teacherProxy.teach();
        String results = teacherProxy.answerQuestions("jojo");
        System.out.println(results);
    }
}
