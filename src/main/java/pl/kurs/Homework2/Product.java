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

    public static void averagePriceAgd(Product[] arrayName) {
        double arrayLengthAgd = 0;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].category.equalsIgnoreCase("agd"))
                arrayLengthAgd++;
        }

        double averagePriceAgd = 0;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].category.equalsIgnoreCase("agd"))
                averagePriceAgd += arrayName[i].price;
        }
        averagePriceAgd = averagePriceAgd / arrayLengthAgd;

        System.out.println("Średnia cena  produktów AGD  talibcy to :" + averagePriceAgd);
    }

    public static void theMostExpensiveProduct(Product[] arrayName) {
        double theMostExpensive = arrayName[0].price;
        String nameTheMostExpensive = arrayName[0].product;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].price > theMostExpensive) {
                theMostExpensive = arrayName[i].price;
                nameTheMostExpensive = arrayName[i].product;
            }
        }
        System.out.println("Najdroższy produkt  talibcy to :" + nameTheMostExpensive + "-" + theMostExpensive);
    }

    public static void theMostCheapestProduct(Product[] arrayName) {
        double theMostCheapest = arrayName[0].price;
        String nameTheMostCheapest = arrayName[0].product;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].price < theMostCheapest) {
                theMostCheapest = arrayName[i].price;
                nameTheMostCheapest = arrayName[i].product;

            }
        }
        System.out.println("Najtańszy produkt  talibcy to :" + nameTheMostCheapest + "-" + theMostCheapest);
    }

    public static void avaragePriceProducts(Product[] arrayName) {
        double averagePrice = 0;
        int arrayLength = arrayName.length;
        for (int i = 0; i < arrayName.length; i++) {
            averagePrice += arrayName[i].price;

        }
        averagePrice = averagePrice / arrayLength;
        System.out.println("Średnia cena wszystkich produktów  talibcy to :" + averagePrice);

    }

    public static void productsExpensiveThanAverage(Product[] arrayName) {

        double averagePrice = 0;

        int arrayLength = arrayName.length;
        for (int i = 0; i < arrayName.length; i++) {
            averagePrice += arrayName[i].price;

        }
        averagePrice = averagePrice / arrayLength;

        int expensiveProducts = 0;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].price > averagePrice) {
                expensiveProducts++;

            }
        }
        System.out.println("Liczba produków drozszych od średniej ceny wynosi:" + expensiveProducts);
    }


}
