package learning_OOP.Polymorphism;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine(){
        System.out.println( "Ford -> "+getName()+" -> startEngine()");
    }

    @Override
    public void accelerate(){
        System.out.println("Ford -> accelerate()");
    }

    @Override
    public void brake(){
        System.out.println("Ford -> brake()");
    }
}
