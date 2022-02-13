package me.hsnam.abstractfactory;

public interface CarFactory {

    default Car orderCar(String name, String email) {
        validate(name, email);
        Car car = createCar();
        prepareFor();
        completeMessage(car);
        return car;
    }

    Car createCar();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("must input name");
        }
        if (email == null || name.isBlank()) {
            throw new IllegalArgumentException("must input email");
        }
    }

    private void prepareFor() {
        System.out.println("building car...");
    }

    void completeMessage(Car car);
}
