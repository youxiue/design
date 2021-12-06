package com.youxiue.design.builder;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:26
 */
public class ConcreteHouseBuilder extends AbsHouseBuilder {

    @Override
    void buildBasic(House house) {
        house.setBasic("混凝土地基");
    }

    @Override
    void buildWalls(House house) {
        house.setWalls("砖墙");
    }

    @Override
    void buildRoofed(House house) {
        house.setRoofed("楼板房顶");
    }
}
