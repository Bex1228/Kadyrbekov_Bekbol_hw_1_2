import java.time.Year;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
    public String getInfo(){
        return "Brand : " + getBrand()+
                "\nModel : " + getModel()+
                "\nYear : " + getYear();

    }
}

