package com.youxiue.design.command;

/**
 * 命令类
 * 统一的命令接口
 * Created by xfb on 2022/05/31 22:18.
 */
public interface Command {


    // 执行命令
    void execute();

    // 取消命令
    void undo();
}
