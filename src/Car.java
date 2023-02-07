public class Car extends Transport {
    private String  drive;

    public Car(String brand, String model, Integer year, String country, String bodyColor, Integer maximumSpeed, String drive) {
        super(brand, model, year, country, bodyColor, maximumSpeed);
        this.drive =drive;
    }



}
