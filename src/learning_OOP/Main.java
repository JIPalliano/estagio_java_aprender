package learning_OOP;

public class Main {
    public static void main(String[] args){
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
