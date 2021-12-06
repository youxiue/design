package com.youxiue.design.builder;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:29
 */
public class HouseDirector {

    private AbsHouseBuilder absHouseBuilder;

    public HouseDirector(AbsHouseBuilder absHouseBuilder) {
        this.absHouseBuilder = absHouseBuilder;
    }


    /**
     * 创建
     * @return
     */
    public House builder(House house){
        absHouseBuilder.buildBasic(house);
        absHouseBuilder.buildWalls(house);
        absHouseBuilder.buildRoofed(house);
        return house;
    }
}
