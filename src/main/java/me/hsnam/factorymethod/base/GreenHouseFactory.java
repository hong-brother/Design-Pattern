package me.hsnam.factorymethod.base;

public class GreenHouseFactory implements HouseFactory {

    @Override
    public House createHouse() {
        return new GreenHouse();
    }
}
