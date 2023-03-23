package com.youxiue.design.strategy;

import com.youxiue.design.strategy.examples.BeijingDuck;
import com.youxiue.design.strategy.examples.Duck;
import com.youxiue.design.strategy.examples.WildDuck;
import com.youxiue.design.strategy.examples.behavior.QuackBehavior;

/**
 * 策略模式
 * 关键:  分析项目中变化部分与不变部分
 * 核心思想:  多用组合/ 聚合, 少用继承, 用行为类组合, 而不是行为的继承,  更有弹性
 *
 * 体现了 对修改关闭, 对扩展开放 原则, 客户端增加行为不用修改原有代码, 只需要添加一种策略(行为)即可, 避免了使用多重转移语句(if..else if ... else).
 *
 * 提供了可以替换继承关系的方法: 策略模式将算法封装在独立的Strategy类中, 使得你可以独立于其Context 改变它, 是他易于切换, 易于理解, 易于扩展.
 *
 * 缺点: 每添加一个策略就要增加一个类, 策略过多会导致类数目庞大.
 * Created by xfb on 2022/05/29 16:51.
 */
public class Client {

    public static void main(String[] args) {
        // 北京鸭
        Duck beijingDuck = new BeijingDuck();
        beijingDuck.quack();
        beijingDuck.fly();

        // 野鸭
        Duck wildDuck = new WildDuck();
        wildDuck.quack();
        wildDuck.fly();

        // 动态设置策略
        wildDuck.setQuackBehavior(new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("叫声洪亮~");
            }
        });
        wildDuck.quack();
    }
}
