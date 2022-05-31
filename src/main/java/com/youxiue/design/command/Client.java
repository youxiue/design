package com.youxiue.design.command;

/**
 * 命令模式
 * Created by xfb on 2022/05/31 22:18.
 */
public class Client {


    public static void main(String[] args) {

        // 创建灯
        LightReceiver lightReceiver = new LightReceiver();
        // 创建灯开关
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 创建tv
        TVReceiver tvReceiver = new TVReceiver();
        // 创建电视开关
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        // 创建遥控器
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, tvOnCommand, tvOffCommand);

        // 遥控
        // 只要按下按钮即可,  不用关心, 命令的具体执行
        remoteControl.on(0);
        remoteControl.off(0);
        remoteControl.undo();
        remoteControl.on(1);
        remoteControl.off(1);
    }
}
