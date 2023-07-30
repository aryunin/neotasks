package factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType type) {
        Coffee coffee;
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new RuntimeException("Invalid coffee type");
        }
        return coffee;
    }
}
