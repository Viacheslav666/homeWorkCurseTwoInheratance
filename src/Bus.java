import Drivers.DriverC;

import java.io.Serializable;
import java.util.List;

public class Bus extends Transport<DriverC> {

    public enum NumberOfSeats {
        VERY_LITTLE(0, 10),
        LITTLE(0, 25),
        AVERAGE(25, 50),
        BIG(50, 80),
        VERY_BIG(80, 120);
        int maxPlaces;
        int minPlaces;

        NumberOfSeats(int maxPlaces, int minPlaces) {
            this.maxPlaces = maxPlaces;
            this.minPlaces = minPlaces;
        }

        public int getMaxPlaces() {
            return maxPlaces;
        }

        public int getMinPlaces() {
            return minPlaces;
        }


        @Override
        public String toString() {
            return "Грузоподьемность{" +
                    "Тип = " + this.name() + "\n"
                    + (minPlaces > 0 ? minPlaces : "нижняя граница ") +
                    (maxPlaces > 0 ? maxPlaces : "верхняя граница тон") +
                    '}';
        }
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    void printType() {
        String message = "Данных по транспортному средству недостаточно";
        Serializable serializable = getType() == null ? message : getType();
        System.out.println(serializable);
    }


    public Bus(String brand, String model, int engineCapacity, DriverC driver, List<Mechanics> mechanicsList) {
        super(brand, model, engineCapacity, driver, mechanicsList);
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeExeption {
        throw new TransportTypeExeption("Автобусы не проходят проверку");

    }

    @Override
    boolean isDiagnosticApplicable() throws TransportTypeExeption {
        return false;
    }

    @Override
    void printNameDriverNameMechanic() {
        System.out.println("Водителя зовут " + getDriver() + "Механика зовут " + getMechanicsList());
    }

    @Override
    void printType(Type name) {

    }


    @Override
    void startMoving() {
        System.out.println("Начало движения  " + getBrand());
    }

    @Override
    void movingStop() {
        System.out.println("Конец движения");
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп");
    }

    @Override
    public void bestLapTimes(String time) {
        System.out.println("Лучшие время = " + time);
    }

    @Override
    public void maxSpeed() {
        int minBound = 40;
        int maxBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость = " + maxSpeed);
    }
}


