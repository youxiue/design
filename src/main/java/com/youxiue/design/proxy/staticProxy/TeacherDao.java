package com.youxiue.design.proxy.staticProxy;

/**
 * 被代理类（目标类）
 * 需要实现一个接口 或继承一个类
 * Created by xfb on 2021/12/11 21:48.
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("上课 教学");
    }
}
