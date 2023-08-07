public class Car extends Vehicle {
    private int numberOfDoors;
    private Engine engine;

    public Car(String brand, String model, int year, int numberOfDoors, Engine engine) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    public void accelerate() {
        System.out.println("Car is accelerating!");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " mph!");
    }

    final public void start() {
        System.out.println("Car is starting!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getInfo() {
        return "Brand : " + getBrand() +
                "\nModel : " + getModel() +
                "\nYear : " + getYear() +
                "\nNumber Of Doors : " + getNumberOfDoors() +
                "\nEngine : " + getEngine() ;
    }
}
