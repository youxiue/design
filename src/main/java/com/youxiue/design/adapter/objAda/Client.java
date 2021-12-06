package com.youxiue.design.adapter.objAda;

/**
 * 对象适配器
 *
 * @author xfb
 * @date 2021/12/1 15:43
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.charge(new PhonePower(new HomePower())); // 可以充电
    }
}
