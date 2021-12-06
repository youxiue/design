package com.youxiue.design.builder;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:24
 */
public abstract class AbsHouseBuilder {

    /**
     * 建地基
     */
    abstract void buildBasic(House house);

    /**
     * 建墙
     */
    abstract void buildWalls(House house);

    /**
     * 建房顶
     */
    abstract void buildRoofed(House house);


}
