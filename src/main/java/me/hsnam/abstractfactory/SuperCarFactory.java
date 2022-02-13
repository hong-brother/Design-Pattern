package me.hsnam.abstractfactory;

public class SuperCarFactory extends DefaultShipFactory{

    private CarPartsFactory carPartsFactory;

    public SuperCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }
    @Override
    public Car createCar() {
        Car car = new SuperCar();
        car.setEngine(this.carPartsFactory.createEngine());
        car.setWheel(this.carPartsFactory.createWheel());
        return car;
    }
}
