import java.util.ArrayList;

import learning_OOP.SortedArray;
import loja.*;
//import lombok.*;

public class Main {
    public static void main(String[] args) {
        LombokPerson lp = new LombokPerson(1, "nome");
        lp.setName("ismael");
        System.out.println(lp.getName());
        System.out.println(lp.toString());

    }
}