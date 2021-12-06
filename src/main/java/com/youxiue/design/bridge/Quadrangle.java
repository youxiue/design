package com.youxiue.design.bridge;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/3 17:49
 */
public class Quadrangle extends AbstractGraph {

    public Quadrangle(ColorInter colorInter) {
        super(colorInter);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("形状: 四边形");
    }
}
