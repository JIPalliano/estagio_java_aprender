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
        InterfaceLearning interfaceLearning2 = () -> System.out.println("alou");
//        interfaceLearning2 = (InterfaceLearning) interfaceLearning;
//        interfaceLearning2.learn();
        System.out.println(interfaceLearning2);
    }
}
