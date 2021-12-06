package com.youxiue.design.bridge;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/3 17:49
 */
public class Hexagon extends AbstractGraph {

    public Hexagon(ColorInter colorInter) {
        super(colorInter);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("形状: 六边形");
    }
}
