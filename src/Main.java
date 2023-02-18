import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {


    public static void main(String[] args) {

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
                ACar.BodyTape.MINIVAN);
        System.out.println(lada.toString());
        ACar lada1 = new ACar(
                "Lada",
                "Samara",
                100,
                driverB,
                ACar.BodyTape.PICKUP);
        System.out.println(lada.getBrand());
        lada.maxSpeed();

        ACar vaz = new ACar(
                "vaz",
                "2107",
                80,
                driverB, ACar.BodyTape.SEDAN);
        ACar vazik = new ACar(
                "vaz",
                "2107",
                80,
                driverB,
                ACar.BodyTape.SUF);
        ACar luaz = new ACar(
                "vaz",
                "2107",
                80, driverB,
                ACar.BodyTape.SUF);
        Bus luna = new Bus(
                "Luna",
                "0000",
                300, driverC);
        Bus luna2 = new Bus(
                "Luna",
                "0000",
                300, driverC);
        Bus luna3 = new Bus(
                "Luna",
                "0000",
                300, driverC);
        Bus luna4 = new Bus(
                "Luna",
                "0000",
                300, driverC);
        FreightCar kamaz = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1);
        FreightCar kamaz1 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD,
                FreightCar.CarryingCapacity.n1);
        FreightCar kamaz2 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1);
        FreightCar kamaz3 = new FreightCar(
                "kamaz",
                "666",
                1000, driverD, FreightCar.CarryingCapacity.n1);

        printInfo(lada1);
        String s = lada1.toString();
        System.out.println(s);
        System.out.println(lada.getType());
        lada.printType();
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println(transport.getDriver() + transport.getBrand());
    }
}