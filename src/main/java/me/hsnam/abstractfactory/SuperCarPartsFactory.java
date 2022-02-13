package me.hsnam.abstractfactory;

public class SuperCarPartsFactory implements CarPartsFactory{
    @Override
    public Engine createEngine() {
        return new SuperEngine();
    }

    @Override
    public Wheel createWheel() {
        return new SuperWheel();
    }
}
