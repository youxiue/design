package com.youxiue.design.facade;

/**
 * Created by xfb on 2022/05/29 15:11.
 */
public class Screen {

    private static final Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on() {
        System.out.println("屏幕打开");
    }

    public void down(){
        System.out.println("屏幕关闭");
    }

}
