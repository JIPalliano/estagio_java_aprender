package learning_lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        System.out.println("Imprime todos os elementos da lista!");
        List<String> list = Arrays.asList("josé", "ismael", "palliano", "evaldt");
        List<String> list2 = new ArrayList<>(list);
        //como se fosse um foreach no php
        for(String n: list2) {
            System.out.println(n);
        }
        //System.out.println(list2);

        PrinterGenerico<String> print = new PrinterGenerico<>("João");
        print.imprimir();
        PrinterGenerico<Integer> print2 = new PrinterGenerico<>(33);
        print2.imprimir();
        PrinterGenerico<String> prin3 = new PrinterGenerico<>("Zezé");
        System.out.println(prin3.imprimirResultado());
        PrinterGenerico<Integer> print4 = new PrinterGenerico<>(120);
        System.out.println(print4.imprimirResultado());

        //utilizando lambda em java
        interface Operacao {int calcular(int x, int y);}

        Operacao soma = (x,y) -> x + y;
        System.out.println(soma.calcular(2, 3));
        Operacao subtracao = (x,y) -> x - y;
        System.out.println(subtracao.calcular(3, 2));
        list2.stream().limit(2).forEach(System.out::println);
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2018, 3, 9)));



    }
}
