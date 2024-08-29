package learning_OOP;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        SortedArray sortedArray = new SortedArray();
        System.out.println("Set value:");
        int value = input.nextInt();

        int[] teste = SortedArray.getIntegers(value);
        //SortedArray.getIntegers(value);
        SortedArray.printArray(teste);
        System.out.println(sortedArray.toString(teste));

        RomanSymbols numberRoman = RomanSymbols.valueOf("V");
        System.out.println(numberRoman.intToRoman(10000));


    }
}
