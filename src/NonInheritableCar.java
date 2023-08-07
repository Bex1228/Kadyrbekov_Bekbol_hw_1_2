public class NonInheritableCar extends Car {
    private FuelType fuelType;

    public enum FuelType {
        GASOLINE, DIESEL, ELECTRIC
    }

    public NonInheritableCar(String brand, String model, int year, int numberOfDoors, Engine engine, FuelType fuelType) {
        super(brand, model, year, numberOfDoors, engine);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " Fuel type: " + fuelType;
    }
    public String getInfo() {
        return "Brand : " + getBrand() +
                "\nModel : " + getModel() +
                "\nYear : " + getYear() +
                "\nNumber Of Doors : " + getNumberOfDoors() +
                "\nEngine : " + getEngine() +
                "\nFuelType : " + fuelType;


    }
    }

