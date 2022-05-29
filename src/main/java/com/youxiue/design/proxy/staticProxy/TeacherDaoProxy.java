package com.youxiue.design.proxy.staticProxy;

/**
 * 代理类
 * 静态代理  需要与 被代理类实现相同的接口
 * Created by xfb on 2021/12/11 21:49.
 */
public class TeacherDaoProxy implements ITeacherDao {

    /**
     * 被代理目标类
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理前。。。");
        target.teach();
        System.out.println("代理结束。。。");
    }
}
