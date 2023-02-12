package Drivers;

public class DriverB extends Driver{
    public final String license = "B";
    public DriverB(String name, boolean havingADriverLicense, int experience,String license) {
        super(name,havingADriverLicense,experience);

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
