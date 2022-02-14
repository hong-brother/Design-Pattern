package factory;

import me.hsnam.factorymethod.base.BlackHouseFactory;
import me.hsnam.factorymethod.base.GreenHouseFactory;
import me.hsnam.factorymethod.base.House;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    @DisplayName("simple Factory pattern")
    public void clientHouseTest() {
        System.out.println("Set Order");
        House green = new GreenHouseFactory().orderHouse("green", "hsnam@gmail.com");
        House black = new BlackHouseFactory().orderHouse("black", "hsnam@gmail.com");

        System.out.println(green);
        System.out.println(black);

    }
}
