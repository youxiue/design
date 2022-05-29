package com.youxiue.design.facade;

/**
 * 外观模式, 也叫 门面模式, 过程模式
 * 外观模式为子系统中的一组接口提供一个一致的界面, 此模式定义了一个高层的接口, 这个接口使得这一子系统更加容易使用.
 * 通过定义一个一致的接口, 用以屏蔽内部子系统的细节, 使得调用端只需要跟这个价接口发生调用, 不用关系内部细节.
 * Created by xfb on 2022/05/29 15:20.
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("--------------家庭影院播放--------------");
        homeTheaterFacade.run();
        System.out.println("--------------家庭影院暂停--------------");
        homeTheaterFacade.pause();
        System.out.println("--------------家庭影院关闭--------------");
        homeTheaterFacade.down();
    }
}
