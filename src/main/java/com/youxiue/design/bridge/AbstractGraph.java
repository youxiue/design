package com.youxiue.design.bridge;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/12/3 17:44
 */
public abstract class AbstractGraph {

    private ColorInter colorInter;

    AbstractGraph(ColorInter colorInter) {
        this.colorInter = colorInter;
    }

    public void describe(){
        String color = colorInter.getColor();
        System.out.println("颜色: "+ color);
    }
}
