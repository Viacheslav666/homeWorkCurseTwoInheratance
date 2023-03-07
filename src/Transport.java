import Drivers.Driver;
import Util.UtilClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competingoable {
    public String brand;
    private String model;
    private int engineCapacity;
    private T driver;
    private List<Mechanics> mechanicsList;


    public Transport(String brand, String model, int engineCapacity, T driver, List<Mechanics> mechanicsList) {
        this.brand = UtilClass.checkingError(brand, "default");
        this.model = UtilClass.checkingError(model, "default");
        this.engineCapacity = UtilClass.checkingErrorInt(engineCapacity, 96);
        setDriver(driver);
        this.mechanicsList = mechanicsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return engineCapacity == transport.engineCapacity && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanicsList, transport.mechanicsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity, driver, mechanicsList);
    }

    public Transport(List<Mechanics> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }


    abstract boolean passDiagnostics() throws TransportTypeExeption;

    abstract boolean isDiagnosticApplicable() throws TransportTypeExeption;

    abstract void printNameDriverNameMechanic();

    abstract void printType(Type name);

    public List<Mechanics> getMechanicsList() {
        return mechanicsList;
    }

    abstract Type getType();

    abstract void printType();


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

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getModel() {
        return model;
    }

    ;

    public void setBrand(String brand) {
        this.brand = brand;
    }

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

