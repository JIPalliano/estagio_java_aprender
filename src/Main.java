import java.util.ArrayList;

import learning_OOP.SortedArray;
import loja.*;
//import lombok.*;

public class Main {
    public static void main(String[] args) {
        LombokPerson lp = new LombokPerson(1, "nome");
        InterfaceLearning innter = new InterfaceLearning(){
            @Override
            public void learn() {
                System.out.println("alllou");
            }

            @Override
            public String getName() {
                return "alou";
            }
        };
        innter.learn();
        System.out.println(innter.getName());
        lp.setName("ismael");
        System.out.println(lp.getName());
        System.out.println(lp.toString());

        Teste test = new Teste("a","b", "c", 10, true);
        test.learn();
        System.out.println(test.getName());

    }
}