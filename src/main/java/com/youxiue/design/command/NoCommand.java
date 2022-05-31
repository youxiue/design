package com.youxiue.design.command;

/**
 * 空指令, 用于初始化每个按钮, 当调用空指令时, 什么都不做
 * 其实, 这样也是一种设计模式,  用于省掉 对空的判断
 * Created by xfb on 2022/05/31 22:26.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
