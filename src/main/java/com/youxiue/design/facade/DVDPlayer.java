package com.youxiue.design.facade;

/**
 * Created by xfb on 2022/05/29 14:39.
 */
public class DVDPlayer {


    // 使用单例模式, 饿汉式
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD打开");
    }

    public void down(){
        System.out.println("DVD关闭");
    }

    public void pause(){
        System.out.println("DVD暂停");
    }
}
