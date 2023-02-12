package Drivers;
import Util.UtilClass.*;

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
                "nameDriver='" + nameDriver + '\'' +
                ", havingADriverLicense=" + havingADriverLicense +
                ", experience=" + experience +
                '}';
    }
}
