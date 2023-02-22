import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

import java.util.*;

public class Main {


    private static Queue<ServiceStation> LinkedList;

    public static void main(String[] args)  {


        DriverB driverB = new DriverB("Volodia",
                false,
                20, "1");
        DriverC driverC = new DriverC("Volodia",
                false,
                20, "1");
        DriverD driverD = new DriverD("Volodia",
                false,
                20, "1");

        ACar lada = new ACar(
                "Lada",
                "Samara",
                100,
                driverB,
                ACar.BodyTape.MINIVAN, List.of(new Mechanics("Ivan", "Audi")));
        System.out.println(lada.toString());
        ACar lada1 = new ACar(
                "Lada",
                "Samara",
                100,
                driverB,
                ACar.BodyTape.PICKUP, List.of(new Mechanics("Misha", "BMW")));
        System.out.println(lada.getBrand());
        lada.maxSpeed();

        ACar vaz = new ACar(
                "vaz",
                "2107",
                80,
                driverB, ACar.BodyTape.SEDAN, List.of(new Mechanics("Sasha", "Ford")));
        ACar vazik = new ACar(
                "vaz",
                "2107",
                80,
                driverB,
                ACar.BodyTape.SUF, List.of(new Mechanics("Gera", "Volvo")));
        ACar luaz = new ACar(
                "vaz",
                "2107",
                80, driverB,
                ACar.BodyTape.SUF, List.of(new Mechanics("Mitia", "Reno")));
        Bus luna = new Bus(
                "Luna",
                "0000",
                300, driverC, List.of(new Mechanics("Ivan", "Audi")));
        Bus luna2 = new Bus(
                "Luna",
                "0000",
                300, driverC, List.of(new Mechanics("Ivan", "Audi")));
        Bus luna3 = new Bus(
                "Luna",
                "0000",
                300, driverC, List.of(new Mechanics("Ivan", "Audi")));
        Bus luna4 = new Bus(
                "Luna",
                "0000",
                300, driverC, List.of(new Mechanics("Ivan", "Audi")));
        FreightCar kamaz = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1, List.of(new Mechanics("Mitia", "Reno")));
        FreightCar kamaz1 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD,
                FreightCar.CarryingCapacity.n1,List.of(new Mechanics("Mitia", "Reno")));
        FreightCar kamaz2 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1, List.of(new Mechanics("Mitia", "Reno")));
        FreightCar kamaz3 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1,List.of(new Mechanics("Mitia", "Reno")));
        List<Transport> list = new ArrayList();
        List.of(kamaz2, kamaz3, kamaz1, kamaz, luaz, luna2, luna3, luna4, luna, vazik, vaz);



        System.out.println(list);

        printInfo(lada1);
        String s = lada1.toString();
        System.out.println(s);
        System.out.println(lada.getType());
        lada.printType();
        lada.printType();
        System.out.println(kamaz3.getEngineCapacity());
        checkTransport(kamaz2);
        luaz.printNameDriverNameMechanic();
        Queue<String> nik = new LinkedList<>();
        nik.offer("Володя");
        nik.offer("Петр");

    }

    public static void checkTransport(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (!transport.passDiagnostics()) {
                    try {
                        throw new Exception(transport.getModel() + transport.getBrand() + " Не прошел проверку");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (TransportTypeExeption e) {
                throw new RuntimeException(e);
            }


        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println(transport.getDriver() + transport.getBrand());
    }

}