package com.youxiue.design.command;

/**
 * 关灯的命令
 * Created by xfb on 2022/05/31 22:24.
 */
public class TVOnCommand implements Command {

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
