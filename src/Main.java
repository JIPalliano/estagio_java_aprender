import java.util.ArrayList;
import loja.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");
        //"Aceita números de até 3 unidades decimais, sem o (byte).
        //byte x = 100;
        //"Aceita números de até 5 unidades decimais.
        //short x = 10000;
            //"Aceita números de até 10 unidades decimais.
            //int x = 1000000000;
            //"Aceita números de até 10 unidades decimais.
            //long x = 1000000000;
        //olha
        //int x = 2_147_483_647;
        //System.out.println(x);
        //Dvd cd = new Dvd();
        Revista revista = new Revista("teste", 4.5,"mares do bem", "fafa de belem",
                2024, 1);
        System.out.println(revista);
        revista.setAutor("Julio cocielo");
        System.out.println(revista);


    }
}