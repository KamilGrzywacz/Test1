package pl.kurs.Homework2;

import java.util.PropertyResourceBundle;

public class Runner {
    public static void main(String[] args) {
        Product[] productsArray = new Product[6];
        Product product1 = new Product("FRIDGE", 6000, "aGd");
        Product product2 = new Product("OVEN", 1500, "aGD");
        Product product3 = new Product("COOKER", 1500, "Agd");
        Product product4 = new Product("TV", 6000, "RTV");
        Product product5 = new Product("COMPUTER", 5400, "COMPUTER");
        Product product6 = new Product("Audio", 2450, "RTV");
        productsArray[0] = product1;
        productsArray[1] = product2;
        productsArray[2] = product3;
        productsArray[3] = product4;
        productsArray[4] = product5;
        productsArray[5] = product6;
        product1.averagePriceAg(productsArray);
        product1.theMostExpensiveProduct(productsArray);
        product1.theMostCheapestProduct(productsArray);
        product1.avaragePriceProducts(productsArray);


    }

}

//        double arrayLengthAgd = 0;
//        for (int i = 0; i < productsArray.length; i++) {
//            if (productsArray[i].category.equalsIgnoreCase("agd"))
//                arrayLengthAgd++;
//        }
//
//        double averagePriceAgd = 0;
//        for (int i = 0; i < productsArray.length; i++) {
//            if (productsArray[i].category.equalsIgnoreCase("agd"))
//                averagePriceAgd += productsArray[i].price;
//
//
//        }
//        averagePriceAgd = averagePriceAgd / arrayLengthAgd;
//
//        System.out.println("Średnia cena  produktów AGD  talibcy to :" + averagePriceAgd);
//
//
//        double theMostExpensive = productsArray[0].price;
//        String nameTheMostExpensive = productsArray[0].product;
//        for (int i = 0; i < productsArray.length; i++) {
//            if (productsArray[i].price > theMostExpensive) {
//                theMostExpensive = productsArray[i].price;
//                nameTheMostExpensive = productsArray[i].product;
//
//
//            }
//        }
//        System.out.println("Najdroższy produkt  talibcy to :" + nameTheMostExpensive + "-" + theMostExpensive);
//
//
//        double theMostCheapest = productsArray[0].price;
//        String nameTheMostCheapest = productsArray[0].product;
//        for (int i = 0; i < productsArray.length; i++) {
//            if (productsArray[i].price < theMostCheapest) {
//                theMostCheapest = productsArray[i].price;
//                nameTheMostCheapest = productsArray[i].product;
//
//            }
//        }
//        System.out.println("Najtańszy produkt  talibcy to :" + nameTheMostCheapest + "-" + theMostCheapest);
//
//        double averagePrice = 0;
//        int arrayLength = productsArray.length;
//        for (int i = 0; i < productsArray.length; i++) {
//            averagePrice += productsArray[i].price;
//
//        }
//        averagePrice = averagePrice / arrayLength;
//        System.out.println("Średnia cena wszystkich produktów  talibcy to :" + averagePrice);
//
//        int expensiveProducts = 0;
//        for (int i = 0; i < productsArray.length; i++) {
//            if (productsArray[i].price > averagePrice) {
//                expensiveProducts++;
//
//            }
//        }
//        System.out.println("Liczba produków drozszych od średniej ceny wynosi:" + expensiveProducts);
//
//    }




















