package abstractfactory;

import me.hsnam.abstractfactory.Car;
import me.hsnam.abstractfactory.CarFactory;
import me.hsnam.abstractfactory.SuperCarFactory;
import me.hsnam.abstractfactory.SuperCarPartsFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AbstractFactory {

    @Test
    @DisplayName("추상 팩토리 테스트")
    public void abstractFactoryTest() {
        CarFactory car = new SuperCarFactory(new SuperCarPartsFactory());
        Car superCar = car.createCar();
        System.out.println(superCar.getEngine().getClass());
        System.out.println(superCar.getWheel().getClass());
    }
}
