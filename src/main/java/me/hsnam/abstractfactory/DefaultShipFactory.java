package me.hsnam.abstractfactory;

public abstract class DefaultShipFactory  implements CarFactory {

    @Override
    public void completeMessage(Car car) {
        System.out.println(car.getName() + "Complete car");
    }
}
