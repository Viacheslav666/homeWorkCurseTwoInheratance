
public class Transport {
    public String brand;
    private String model;
    private  Integer year;
    private  String country;
    private String bodyColor;
    private Integer maximumSpeed;

    public Transport() {
    }

    public Transport(String brand, String model, Integer year, String country, String bodyColor, Integer maximumSpeed) {
        this.brand = UtilClass.checkingError(brand, "default");
        this.model = UtilClass.checkingError(model, "default");
        this.year = year;
        this.country = country;
        this.bodyColor = UtilClass.checkingError(bodyColor, "white");
        this.maximumSpeed = UtilClass.checkingErrorInt(maximumSpeed, 60);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaximumSpeed(Integer maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Integer getMaximumSpeed() {
        return maximumSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }
}
