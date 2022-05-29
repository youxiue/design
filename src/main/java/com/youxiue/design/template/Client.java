package com.youxiue.design.template;

/**
 * Created by xfb on 2021/12/13 22:58.
 */
public class Client {

    public static void main(String[] args) {
        SoybeanMilk blackSesameSoybeanMilk = new BlackSesameSoybeanMilk();
        blackSesameSoybeanMilk.make();

        SoybeanMilk redDatesSoybeanMilk = new RedDatesSoybeanMilk();
        redDatesSoybeanMilk.make();

        SoybeanMilk pureSoybeanMilk = new PureSoybeanMilk();
        pureSoybeanMilk.make();
    }
}
