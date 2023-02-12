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
                driverB);
        System.out.println(lada.toString());
        ACar lada1 = new ACar(
                "Lada",
                "Samara",
                100,
                driverB);
        System.out.println(lada.getBrand());
        lada.maxSpeed();

        ACar vaz = new ACar(
                "vaz",
                "2107",
                80,
                driverB);
        ACar vazik = new ACar(
                "vaz",
                "2107",
                80,
                driverB);
        ACar luaz = new ACar(
                "vaz",
                "2107",
                80,driverB);
        Bus luna = new Bus(
                "Luna",
                "0000",
                300,driverC);
        Bus luna2 = new Bus(
                "Luna",
                "0000",
                300,driverC);
        Bus luna3 = new Bus(
                "Luna",
                "0000",
                300,driverC);
        Bus luna4 = new Bus(
                "Luna",
                "0000",
                300,driverC);
        FreightCar kamaz = new FreightCar(
                "kamaz",
                "666",
                1000,driverD);
        FreightCar kamaz1 = new FreightCar(
                "kamaz",
                "666",
                1000,driverD);
        FreightCar kamaz2 = new FreightCar(
                "kamaz",
                "666",
                1000,driverD);
        FreightCar kamaz3 = new FreightCar(
                "kamaz",
                "666",
                1000,driverD);

    }

}