import Drivers.Driver;
import Util.UtilClass;

public abstract class Transport<T extends Driver> implements Competingoable {
    public String brand;
    private String model;
    private int engineCapacity;
    private T driver;


    public Transport() {
    }

    public Transport(String brand, String model, int engineCapacity, T driver) {
        this.brand = UtilClass.checkingError(brand, "default");
        this.model = UtilClass.checkingError(model, "default");
        this.engineCapacity = UtilClass.checkingErrorInt(engineCapacity, 96);
        setDriver(driver);
    }

    abstract void printType(Type name);

    abstract Type getType();

    abstract void  printType();


    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    abstract void startMoving();

    abstract void movingStop();

    public String getBrand() {
        return brand;
    }

    ;

    public String getModel() {
        return model;
    }

    ;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    ;

    @Override
    public String toString() {
        return "Transport{" +
                "Брэнд " + brand + '\'' +
                "Модель " + model + '\'' +
                "Водитель " + getDriver() +
                "Тип автомобиля "
                ;
    }


}

