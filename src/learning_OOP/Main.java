package learning_OOP;

import learning_OOP.Floristry.Floor;
import learning_OOP.Floristry.CalculatorFloor;
import learning_OOP.Floristry.Carpet;

public class Main {
    public static void main(String[] args){
        Floor floor = new Floor(12.0, 32.1);
        Carpet carpet = new Carpet(12.0);
        CalculatorFloor calculatorFloor = new CalculatorFloor(floor, carpet);

        System.out.println(calculatorFloor.getTotalCost());

        Point point = new Point();
        point.setX(100);
        point.setY(20);
        System.out.println(point.distance());
        System.out.println(point.distance(point));
        System.out.println(point.distance(10, 20));

        Wall wall = new Wall();
        wall.setWidth(5);
        wall.setHeight(10);

        System.out.println(wall.getArea());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(80.0);


        System.out.println("Soma: \n"+calculator.getAdditionResult());
        System.out.println("Substração: \n"+calculator.getSubtractionResult());
        System.out.println("Multiplicação: \n"+calculator.getMultiplicationResult());
        System.out.println("Divisão: \n"+calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("9k");
        person.setLastName("89");
        person.setAge(1);

        System.out.println("Idade é maior que 12 e menor que 20: \n"+person.isTeen()+"\nNome completo: \n"+person.getFullName());
    }
}
