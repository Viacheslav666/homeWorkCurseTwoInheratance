import Drivers.Driver;
import Drivers.DriverB;
import Util.UtilClass;

public class ACar extends Transport <DriverB> {
    public ACar(String brand, String model, int engineCapacity, DriverB driver) {
        super(brand, model, engineCapacity, driver);
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
    public void maxSpeed(){
        int minBound = 40;
        int maxBound = 140;
        int maxSpeed = (int)(minBound + (maxBound - minBound)*Math.random());
        System.out.println("Максимальная скорость = " + maxSpeed);
    }

    @Override
    public void bestLapTimes(String time) {
        System.out.println("Лучшие время = " + time);
    }

}
