package learning_OOP.Polymorphism;

public class Car {
    private int cylinders, wheels;
    private String name;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine()");
    }
    public void accelerate(){
        System.out.println("Car -> accelerate()");
    }
    public void brake(){
        System.out.println("Car -> brake()");
    }
}
