package pl.kurs.Homework1;


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




        int[] factors = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int factor = 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % factor == 0 ) {
                factor = array[i];
            }
        }
        System.out.println("Liczba z największa liczbą dzielników to: " + factor);
        //        int cnt = 0;
//        while (cnt < 50) {
//            for ( int i = 0; i < array.length ; i++){
//            if(array[i] % cnt == 0){
//                System.out.println("");
//            }
//
//        } cnt++;
//        }
//            System.out.println("Liczba z największa liczba dzielników to");
//        int cnt = 0;
//            while (cnt <50 ){
//                cnt++;
//            } if (array[i] % cnt)
//        }



//        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
//        int primeNumber = 1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == primeNumbers[i]){
//                primeNumber = array[0];
//                System.out.println("W podanym zbiorze liczba pierwsza to :"+ primeNumber);
//            } else {
//            }
//            System.out.println("Liczba " + array[i] + " nie jest pierwsza");
//        }

    }
    }