package me.hsnam.factorymethod.base;

/**
 * ConcreteProduct
 */
public class BlackHouseFactory implements HouseFactory{
    @Override
    public House createHouse() {
        return new BlackHouse();
    }
}
