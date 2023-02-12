import Drivers.DriverC;

public class Bus extends Transport <DriverC> {
    public Bus(String brand, String model, int engineCapacity, DriverC driver) {
        super(brand, model, engineCapacity, driver);
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
        int maxSpeed = (int)(minBound + (maxBound - minBound)*Math.random());
        System.out.println("Максимальная скорость = " + maxSpeed);
    }
}


