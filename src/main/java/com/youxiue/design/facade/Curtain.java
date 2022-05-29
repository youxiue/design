package com.youxiue.design.facade;

/**
 * Created by xfb on 2022/05/29 15:12.
 */
public class Curtain {

    private static final Curtain instance = new Curtain();

    public static Curtain getInstance(){
        return instance;
    }

    public void open() {
        System.out.println("窗帘打开");
    }

    public void close(){
        System.out.println("窗帘关闭");
    }

}
