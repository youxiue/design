package com.youxiue.design.adapter.classAda;

/**
 * 类适配器模式
 *
 * @author xfb
 * @date 2021/11/26 16:36
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new PhonePower()); // 适合充电
        phone.charge(new WindowPower()); //不适合充电
    }
}
