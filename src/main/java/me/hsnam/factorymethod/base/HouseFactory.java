package me.hsnam.factorymethod.base;

public interface HouseFactory {

    default House orderHouse(String name, String email) {
        validate(name, email);
        House house = createHouse();
        prepareFor();
        completeMessage(name);
        return house;
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("must input name");
        }
        if (email == null || name.isBlank()) {
            throw new IllegalArgumentException("must input email");
        }
    }

    private void prepareFor() {
        System.out.println("building house...");
    }

    House createHouse();

    private void completeMessage(String name) {
        System.out.println(name + "complete house!");
    }
}
