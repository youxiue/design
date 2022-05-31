package com.youxiue.design.command;

/**
 * 灯
 * 具体的执行者
 * Created by xfb on 2022/05/31 22:21.
 */
public class LightReceiver {


    public void on(){
        System.out.println("开灯");
    }

    public void off(){
        System.out.println("关灯");
    }

}
