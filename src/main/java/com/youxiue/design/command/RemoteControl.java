package com.youxiue.design.command;

/**
 * 遥控器
 * Created by xfb on 2022/05/31 22:29.
 */
public class RemoteControl {

    /**
     * 开按钮集合
     */
    private Command[] noCommands;

    /**
     * 关按钮集合
     */
    private Command[] offCommands;

    /**
     * 记住上一个命令
     */
    private Command undoCommand;

    private int controlSize = 2;

    public RemoteControl() {
        // 初始化指令集
        noCommands = new Command[controlSize];
        offCommands = new Command[controlSize];
        for (int i = 0; i < controlSize; i++) {
            // 每个按钮都赋予空指令
            noCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command noCommand, Command offCommand){
        noCommands[index] = noCommand;
        offCommands[index] = offCommand;
    }

    /**
     * 开按钮
     */
    public void on(int index){
        noCommands[index].execute();
        undoCommand = noCommands[index];
    }

    /**
     * 关按钮
     */
    public void off(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    /**
     * 撤销按钮
     */
    public void undo(){
        undoCommand.undo();
        undoCommand = null;
    }
}
