package com.youxiue.design.proxy.cglib;

/**
 * 被代理类（目标类）
 * 不需要实现接口或继承一个类
 * Created by xfb on 2021/12/11 21:48.
 */
public class TeacherDao {

    public void teach() {
        System.out.println("上课 教学");
    }

    public String answerQuestions(String name) {
        System.out.println(name+ "起来回答问题");
        return "投掷粉笔头";
    }
}
