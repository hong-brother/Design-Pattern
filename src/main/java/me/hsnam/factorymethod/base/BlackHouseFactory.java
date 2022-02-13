package me.hsnam.factorymethod.base;

public class BlackHouseFactory implements HouseFactory{
    @Override
    public House createHouse() {
        return new BlackHouse();
    }
}
