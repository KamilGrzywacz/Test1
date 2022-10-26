package pl.kurs.Homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

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


        //int[] array = {10, 20, 30, 40, 50};
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


    }
}