import Drivers.DriverB;
import Util.UtilClass;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class ACar extends Transport<DriverB> {
    private BodyTape bodyTape;

    public ACar(String brand, String model, int engineCapacity, DriverB driver,BodyTape bodyTape , List<Mechanics> mechanicsList) {
        super(brand, model, engineCapacity, driver, mechanicsList);
        this.bodyTape = bodyTape;
    }



    public enum BodyTape {
        SEDAN("Седан"),
        HATCHBACK("Седан"),
        COUPE("Седан"),
        UNIVERSAL("Седан"),
        SUF("Седан"),
        CROSSOVER("Седан"),
        PICKUP("Седан"),
        FAN("Седан"),
        MINIVAN("Седан");
        public String nameBodyTape;

        BodyTape(String nameBodyTape) {
            this.nameBodyTape = nameBodyTape;
        }

        public String getNameBodyTape() {
            return nameBodyTape;
        }

        @Override
        public String toString() {
            return "bodyTape{" +
                    "bodyTape" + this.name() + "\n" +
                    "name='" + getNameBodyTape() + '\'' +
                    '}';
        }

    }



    @Override
    public Type getType() {
        return Type.ACAR;
    }

    @Override
    void printType() {
        String message = "Данных по транспортному средству недостаточно";
        Serializable serializable = getType() == null ? message : getType();
        System.out.println(serializable);
    }

    @Override
    void printNameDriverNameMechanic() {
        System.out.println("Водителя зовут " + getDriver() + "Механика зовут " + getMechanicsList());
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = UtilClass.checkingError(brand, "lada");
    }

    @Override
    void printType(Type name) {

    }

    @Override
    boolean passDiagnostics() throws TransportTypeExeption {
        return true;
    }

    @Override
    boolean isDiagnosticApplicable() throws TransportTypeExeption {
        return true;
    }

    @Override
    void startMoving() {
        System.out.println("Начало движения");
    }

    @Override
    void movingStop() {
        System.out.println("Конец движения");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стор");
    }

    @Override
    public void maxSpeed() {
        int minBound = 40;
        int maxBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость = " + maxSpeed);
    }

    @Override
    public void bestLapTimes(String time) {
        System.out.println("Лучшие время = " + time);
    }

    @Override
    public String toString() {
        return "ACar{" +
                "Брэнд - " + getBrand() + '\'' +
                "Модель - " + getModel() +
                "Водитель- " + getDriver();

    }

}
