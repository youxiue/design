package com.youxiue.design.proxy.jdk;

/**
 * 被代理类（目标类）
 * 需要实现一个接口
 * Created by xfb on 2021/12/11 21:48.
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("上课 教学");
    }

    @Override
    public String answerQuestions(String name) {
        System.out.println(name+ "起来回答问题");
        return "投掷粉笔头";
    }
}
