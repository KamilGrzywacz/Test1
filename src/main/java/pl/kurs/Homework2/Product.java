package pl.kurs.Homework2;

public class Product {
    private String product;
    private double price;
    private String category;


    public Product(String product, int price, String category) {
        this.product = product;
        this.price = price;
        this.category = category;

    }

    void averagePriceAg(Product[] productsArray) {
        double arrayLengthAgd = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].category.equalsIgnoreCase("agd"))
                arrayLengthAgd++;
        }

        double averagePriceAgd = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].category.equalsIgnoreCase("agd"))
                averagePriceAgd += productsArray[i].price;


        }
        averagePriceAgd = averagePriceAgd / arrayLengthAgd;
        System.out.println("Średnia cena  produktów AGD  talibcy to :" + averagePriceAgd);
    }

    void theMostExpensiveProduct(Product[] productsArray) {
        double theMostExpensive = productsArray[0].price;
        String nameTheMostExpensive = productsArray[0].product;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].price > theMostExpensive) {
                theMostExpensive = productsArray[i].price;
                nameTheMostExpensive = productsArray[i].product;
            }
        }
        System.out.println("Najdroższy produkt  talibcy to :" + nameTheMostExpensive + "-" + theMostExpensive);
    }

    void theMostCheapestProduct(Product[] productsArray) {
        double theMostCheapest = productsArray[0].price;
        String nameTheMostCheapest = productsArray[0].product;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].price < theMostCheapest) {
                theMostCheapest = productsArray[i].price;
                nameTheMostCheapest = productsArray[i].product;

            }
        }
        System.out.println("Najtańszy produkt  talibcy to :" + nameTheMostCheapest + "-" + theMostCheapest);
    }

    void avaragePriceProducts(Product[] productsArray) {
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
