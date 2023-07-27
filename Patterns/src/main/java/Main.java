import Adapter.Computer;
import Adapter.MemoryCard;
import Adapter.MemoryCardAdapter;
import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeType;
import Proxy.DBConnection;
import Proxy.DBConnectionProxy;
import Singleton.Logger;

public class Main {
    private static final Logger log = Logger.getInstance();

    public static void main(String[] args) {
        testFactory();
        System.out.println();
        testAdapter();
        System.out.println();
        testProxy();
    }

    private static void testProxy() {
        DBConnection connection = new DBConnection("my-database");
        final String host = "localhost";
        final String port = "8080";
        final String address = host + ":" + port;
        DBConnectionProxy proxy = new DBConnectionProxy(connection, address);
        proxy.connect();
    }

    public static void testFactory() {
        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.AMERICANO);
        log.classLogg(americano, "expected americano");
        Coffee espresso = CoffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        log.classLogg(espresso, "expected espresso");
    }

    public static void testAdapter() {
        Computer computer = new Computer();
        MemoryCard mc = new MemoryCard("some info on card");
        MemoryCardAdapter adapter = new MemoryCardAdapter(mc);
        computer.connectUsbDevice(adapter);
        computer.printInfoFromUsb();
    }
}
