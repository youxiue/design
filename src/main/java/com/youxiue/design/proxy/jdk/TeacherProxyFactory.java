package com.youxiue.design.proxy.jdk;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;


/**
 * 代理类
 * 返回一个动态代理
 * Created by xfb on 2021/12/11 23:14.
 */
public class TeacherProxyFactory {

    /**
     * 被代理对象
     */
    private ITeacherDao target;

    public TeacherProxyFactory(ITeacherDao target) {
        this.target = target;
    }

    /**
     * 返回动态代理类的方法
     *
     * @return
     */
    Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                System.out.println("代理方法前。。。。。。。。。");
                Object results = method.invoke(target, args);
                System.out.println("代理方法后。。。。。。。。。");
                return results;
            }
        });
    }

}
