package com.youxiue.design.strategy;

/**
 * Created by xfb on 2022/05/29 17:06.
 */
public class Duck {

    private String name;

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void swim(){
        System.out.println("游泳");
    }

    public void quack(){
        if(quackBehavior != null){
            quackBehavior.quack();
        }
    }

    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
