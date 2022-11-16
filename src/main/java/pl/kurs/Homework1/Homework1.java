package pl.kurs.Homework1;


import java.time.temporal.ValueRange;
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

        int maxValueFromArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValueFromArray) {
                maxValueFromArray = array[i];
            }
        }
        System.out.println("Największy element talibcy to :" + maxValueFromArray);

        int minValueFromArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValueFromArray) {
                minValueFromArray = array[i];
            }
        }
        System.out.println("Najmniejszy element talibcy to :" + minValueFromArray);


        int[] factors = new int[array.length];

        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < 100; j++) {
                if (array[i] % j == 0) {
                    factors[i]++;
                }
            }
        //  int theMostFactors = factors[0];
        //  for(int i =0; i < factors.length ; i++) {
        //  if (factors[i] > theMostFactors) {
        //      theMostFactors = factors[i];
        //  }
        //   }
        //    System.out.println(theMostFactors);}

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
}
