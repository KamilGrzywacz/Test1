package pl.kurs.Homework2;

import java.util.Arrays;
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
        Product.averagePriceAgd(productsArray);
        Product.theMostExpensiveProduct(productsArray);
        Product.theMostCheapestProduct(productsArray);
        Product.avaragePriceProducts(productsArray);
        Product.productsExpensiveThanAverage(productsArray);

    }


}















