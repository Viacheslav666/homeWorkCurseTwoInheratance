package Drivers;
import Util.UtilClass.*;

import java.util.Objects;

import static Util.UtilClass.checkingError;
import static Util.UtilClass.checkingErrorInt;

public abstract class Driver {
    private String nameDriver;
    private boolean havingADriverLicense;
    private int experience;


    public Driver() {
    }
    public Driver(String nameDriver, boolean havingADriverLicense, int experience) {
        this.nameDriver = checkingError(nameDriver, "Petr");
        this.havingADriverLicense = havingADriverLicense;
        this.experience = checkingErrorInt(experience, 18);
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public boolean isHavingADriverLicense() {
        return havingADriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    abstract void starMoving();

    abstract void stopMoving();

    abstract void refuelCar();

    @Override
    public String toString() {
        return "Driver{" +
                "Имя водителя'" + nameDriver + '\'' +
                ", Лицензия " + havingADriverLicense +
                ", Стаж " + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return havingADriverLicense == driver.havingADriverLicense && experience == driver.experience && Objects.equals(nameDriver, driver.nameDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDriver, havingADriverLicense, experience);
    }
}
