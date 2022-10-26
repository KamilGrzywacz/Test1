package pl.kurs.Homework2;

public class Runner {
    public static void main(String[] args) {
        Product[] productsArray = new Product[6];
        Product product1 = new Product("FRIDGE", 3000, "AGD");
        Product product2 = new Product("OVEN", 2000, "AGD");
        Product product3 = new Product("COOKER", 1500, "AGD");
        Product product4 = new Product("TV", 5000, "RTV");
        Product product5 = new Product("COMPUTER", 5400, "COMPUTER");
        Product product6 = new Product("Audio", 2450, "RTV");
        productsArray[0] = product1;
        productsArray[1] = product2;
        productsArray[2] = product3;
        productsArray[3] = product4;
        productsArray[4] = product5;
        productsArray[5] = product6;

        int arrayLengthAgd = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].category == "AGD")
                arrayLengthAgd++;
        }

        double averagePriceAgd = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].category == "AGD")
                averagePriceAgd += productsArray[i].price;


        }
        averagePriceAgd = averagePriceAgd / arrayLengthAgd;
        System.out.println("Średnia cena  produktów AGD  talibcy to :" + averagePriceAgd);

        double theMostExpensive = productsArray[0].price;
        String nameTheMostExpensive = productsArray[0].product;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].price > theMostExpensive) {
                theMostExpensive = productsArray[i].price;
                nameTheMostExpensive = productsArray[i].product;


            }
        }
        System.out.println("Najdroższy produkt  talibcy to :" + nameTheMostExpensive + "-" + theMostExpensive);


        double theMostCheapest = productsArray[0].price;
        String nameTheMostCheapest = productsArray[0].product;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].price < theMostCheapest) {
                theMostCheapest = productsArray[i].price;
                nameTheMostCheapest = productsArray[i].product;

            }
        }
        System.out.println("Najtańszy produkt  talibcy to :" + nameTheMostCheapest + "-" + theMostCheapest);

        double averagePrice = 0;
        int arrayLength = productsArray.length;
        for (int i = 0; i < productsArray.length; i++) {
            averagePrice += productsArray[i].price;

        }
        averagePrice = averagePrice / arrayLength;
        System.out.println("Średnia cena wszystkich produktów  talibcy to :" + averagePrice);

        int expensiveProducts = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].price > averagePrice) {
                expensiveProducts++;

            }
        }
        System.out.println("Liczba produków drozszych od średniej ceny wynosi:" + expensiveProducts);

    }
}



















