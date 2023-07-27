import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeType;
import Singleton.Logger;

public class Main {
    private static final Logger log = Logger.getInstance();

    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.AMERICANO);
        log.classLogg(americano, "expected americano");
        Coffee espresso = CoffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        log.classLogg(espresso, "expected espresso");
    }
}
