import Drivers.DriverD;

public class FreightCar extends Transport <DriverD> {
    public FreightCar(String brand, String model, int engineCapacity, DriverD driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public String getBrand() {
        return brand;
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
        System.out.println("Пит - стоп");
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