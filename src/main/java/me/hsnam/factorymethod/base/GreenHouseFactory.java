package me.hsnam.factorymethod.base;

/**
 * ConcreteProduct
 */
public class GreenHouseFactory implements HouseFactory {

    @Override
    public House createHouse() {
        return new GreenHouse();
    }
}
