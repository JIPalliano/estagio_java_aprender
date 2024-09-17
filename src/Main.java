import java.util.*;

import com.sun.management.GarbageCollectionNotificationInfo;
import learning_OOP.SortedArray;
import loja.*;

public class Main extends Thread{

    public void testeIf(){
        for(long i=0;i<100000000; i++){
            if(i==100000000){
                System.out.println("é verdade "+i);
            }
        }
    }

    public void testeSwitch(){
        for(int i=1;i<100000000; i++){
            switch(i) {
                case 100000000:
                    System.out.println("número é"+i);
            }
        }
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        //list.add(5);
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

    public static Integer addNumbers2(List<? super Integer>list){
        list.add(1);
        list.add(2);
        list.add(3);
        return list.stream().toList().size();
    }
    public static void main(String[] args) {
        InterfaceLearning interfaceLearning = new InterfaceLearning() {
            @Override
            public void learn() {

            }

            @Override
            public String getName() {
                return "";
            }
        };

        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);

        List<Number> numList = new ArrayList<>();
        numList.add(5);
        addNumbers(numList);
        System.out.println(numList);
        addNumbers2(intList);

        System.out.println(sumNumbers(intList));
        System.out.println(sumNumbers(doubleList));

        InterfaceLearning interfaceLearning2 = () -> System.out.println("alou");
//        interfaceLearning2 = (InterfaceLearning) interfaceLearning;
//        interfaceLearning2.learn();
        //System.out.println(interfaceLearning2);
    }
}
