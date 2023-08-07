public class Main {
    public static void main(String[] args) {
      Car objectA = new Car("BMW", "740iL", 1999, 4, Engine.V8);
      NonInheritableCar objectB = new NonInheritableCar("MERCEDES", "CLS 6.3 AMG", 2018, 4, Engine.V8, NonInheritableCar.FuelType.GASOLINE );
      NonInheritableCar objectC = new NonInheritableCar("TESLA", "MODEL 3", 2020, 4 , Engine.ELECTRIC, NonInheritableCar.FuelType.ELECTRIC);


        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());






      objectA.accelerate();
      objectB.start();
      objectC.accelerate(90);
     }
}