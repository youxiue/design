package com.youxiue.design.builder;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:26
 */
public class CommonHouseBuilder extends AbsHouseBuilder {

    @Override
    void buildBasic(House house) {
        house.setBasic("木质地基");
    }

    @Override
    void buildWalls(House house) {
        house.setWalls("木墙");
    }

    @Override
    void buildRoofed(House house) {
        house.setRoofed("草房顶");
    }
}
