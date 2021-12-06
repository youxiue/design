package com.youxiue.design.bridge;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/3 17:51
 */
public class Client {

    public static void main(String[] args) {

        // 蓝色 四边形
        new Quadrangle(new BlueColor()).describe();
        System.out.println("------------------------");
        // 红色 四边形
        new Quadrangle(new RedColor()).describe();
        System.out.println("------------------------");
        // 蓝色 六边形
        new Hexagon(new BlueColor()).describe();
        System.out.println("------------------------");
        // 红色 六边形
        new Hexagon(new RedColor()).describe();
        System.out.println("------------------------");
    }

}
