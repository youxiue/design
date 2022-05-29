package com.youxiue.design.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 * Created by xfb on 2021/12/11 23:30.
 */
public class TeacherProxyFactory implements MethodInterceptor {

    private TeacherDao target;

    public TeacherProxyFactory(TeacherDao target) {
        this.target = target;
    }

    /**
     * 返回代理子类
     * @return
     */
    Object getProxyInstance(){
        // 增强代理类
        Enhancer enhancer = new Enhancer();
        // 设置父类(即被代理类)
        enhancer.setSuperclass(target.getClass());
        // 设置回调
        enhancer.setCallback(this);
        // 创建子类代理类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理方法执行前");
        Object results = method.invoke(target, args);
        System.out.println("代理方法执行后");
        return results;
    }
}
