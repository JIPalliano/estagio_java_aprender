package learning_OOP;


import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        //10 - 1 = 9
        //10/2 = 5
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];                    // Na posição 0 recebe o valor 1/ na posição 1 recebe o valor 2
            array[i] = array[maxIndex - i];         // Na posição 9 - 0/ 9 - 1/ 9 -2/ 9 - 3...
            array[maxIndex - i] = temp;             // Na posição 9  recebe recebe o valor temporario
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
