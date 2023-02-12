package Drivers;

public class DriverD extends Driver{
    public final String license = "D";

    public DriverD(String nameDriver, boolean havingADriverLicense, int experience,String license) {
        super(nameDriver, havingADriverLicense, experience);
    }


    @Override
    void starMoving() {
        System.out.println("Начала движения");
    }

    @Override
    void stopMoving() {
        System.out.println("Конец движения");
    }

    @Override
    void refuelCar() {
        System.out.println("Заправка");
    }
    public String getLicense() {
        return license;
    }
}

