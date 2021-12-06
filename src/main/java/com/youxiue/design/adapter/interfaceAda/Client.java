package com.youxiue.design.adapter.interfaceAda;

/**
 * 接口适配器
 *
 * 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求，它适用于一个接口不想使用其所有的方法的情况。因此也称为单接口适配器模式。
 *
 * @author xfb
 * @date 2021/12/1 16:30
 */
public class Client {
    public static void main(String[] args) {


        User user = new User();

        // 只实现自己想要的
        user.cook(new AbsRoom() {
            @Override
            public void cook(){
                System.out.println("做饭吃吧");
            }
        });

        // 需要全部实现
        user.cook(new RoomInterface() {

            @Override
            public void sleep() {

            }

            @Override
            public void cook() {
                System.out.println("会不会做饭啊");
            }

            @Override
            public void watchMove() {

            }
        });
    }
}
