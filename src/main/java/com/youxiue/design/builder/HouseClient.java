package com.youxiue.design.builder;

/**
 * TODO
 *
 * @author xfb
 * @date 2021/11/25 17:31
 */
public class HouseClient {

    public static void main(String[] args) {
        AbsHouseBuilder houseBuilder = new ConcreteHouseBuilder();
        //AbsHouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = new House();
        house = houseDirector.builder(house);
        System.out.println(house);

    }
}
