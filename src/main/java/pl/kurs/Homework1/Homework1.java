package pl.kurs.Homework1;


import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczby rozdzielając je spacja");
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");
        int[] array = new int[split.length];
        int s = 0;
        for (String string : split) {
            array[s++] = Integer.parseInt(string);
        }
        Homework1.maxValue(array);
        Homework1.minValue(array);
        Homework1.factors(array);
        Homework1.primeNubers(array);
    }

    private static void maxValue(int[] array) {
        int maxValueFromArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValueFromArray) {
                maxValueFromArray = array[i];
            }

        }
        System.out.println("Największy element talibcy to :" + maxValueFromArray);
    }
    public static void minValue (int[] array) {
        int minValueFromArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValueFromArray) {
                minValueFromArray = array[i];
            }
        }
        System.out.println("Najmniejszy element talibcy to :" + minValueFromArray);
    }
    public static void factors(int[] array) {
        int[] factors = new int[array.length];

        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < 100; j++) {
                if (array[i] % j == 0) {
                    factors[i]++;
                }
            }
        System.out.println("Ilość dzielników dla podanych elementów to : " + Arrays.toString(factors));

    }
    public static void primeNubers(int[] array){
    int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
            for (int i = 0; i < array.length ; i++) {
        for (int j = 0; j < primeNumbers.length; j++)
            if (array[i] == primeNumbers[j]) {
                System.out.println("W podanym zbiorze liczba pierwsza to :" + array[i]);
            } else {
            }
    }
        System.out.println("Brak liczb pierwszych w podanym zbiorze ");



}


















}






/*
        void maxValue (Homework1[] array1) {
           int maxValueFromArray = 0;
           for (int i = 0; i < array1.length; i++) {
               if (array1[i] > maxValueFromArray) {
                   maxValueFromArray = array1[i];
               }
           }
       }
           public static void maxValue (int[] array) {
               int minValueFromArray = array[0];
               for (int i = 0; i < array.length; i++) {
                   if (array[i] < minValueFromArray) {
                       minValueFromArray = array[i];
                   }
               }
               System.out.println("Najmniejszy element talibcy to :" + minValueFromArray);

           }
            int[] factors = new int[array.length];

            for (int i = 0; i < array.length; i++)
                for (int j = 1; j < 100; j++) {
                    if (array[i] % j == 0) {
                        factors[i]++;
                    }
                }
            System.out.println("Ilość dzielników dla podanych elementów to : " + Arrays.toString(factors));


            int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < primeNumbers.length; j++)
                    if (array[i] == primeNumbers[j]) {
                        System.out.println("W podanym zbiorze liczba pierwsza to :" + array[i]);
                    } else {
                    }
            }
            System.out.println("Brak liczb pierwszych w podanym zbiorze ");


        }

    }*/

