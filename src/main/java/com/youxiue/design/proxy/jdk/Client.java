package com.youxiue.design.proxy.jdk;

/**
 * 动态代理- jdk
 * Created by xfb on 2021/12/11 23:21.
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        TeacherProxyFactory proxyFactory = new TeacherProxyFactory(iTeacherDao);

        ITeacherDao teacherProxy = (ITeacherDao)proxyFactory.getProxyInstance();
        teacherProxy.teach();

        String answer = teacherProxy.answerQuestions("小恐龙");
        System.out.println(answer);

    }
}
