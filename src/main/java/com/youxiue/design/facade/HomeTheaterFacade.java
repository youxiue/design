package com.youxiue.design.facade;

/**
 * 家庭影院
 * Created by xfb on 2022/05/29 15:15.
 */
public class HomeTheaterFacade {

    private final Curtain curtain;
    private final DVDPlayer dvdPlayer;
    private final Screen screen;

    public HomeTheaterFacade() {
        this.curtain = Curtain.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.screen = Screen.getInstance();
    }

    public void run(){
        curtain.close();
        screen.on();
        dvdPlayer.on();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void down(){
        screen.down();
        dvdPlayer.down();
        curtain.open();
    }
}
