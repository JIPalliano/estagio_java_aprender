package learning_OOP.Polymorphism;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void accelerate(){
        System.out.println(getClass().getSimpleName() + " -> accelerate()");
    }

    @Override
    public void brake(){
        System.out.println(getClass().getSimpleName() + " -> brake()");
    }
}
