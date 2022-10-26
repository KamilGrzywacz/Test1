package pl.kurs.Homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {
    private String name;
    private String nameOfBank;
    private long number;
    private String pesel;
    private double lendingRate;
    private double balance;

    BankAccount[] bankAccountsHistory = new BankAccount[100];


    public BankAccount(String name, String nameOfBank, long number, String pesel, double lendingRate, double balance) {
        this.name = name;
        this.nameOfBank = nameOfBank;
        this.number = number;
        this.pesel = pesel;
        this.lendingRate = lendingRate;
        this.balance = balance;

    }


    Scanner scanner = new Scanner(System.in);


    void cashOut1() {
        int money;
        System.out.println("Podaj jaką kwotę chcesz wypłacić ");
        money = scanner.nextInt();
        balance = balance - money;
        System.out.println("Twoj stan konta po wypłacie to: " + balance);


    }

    void cashOut() {
        int money;
        System.out.println("Podaj jaką kwotę chcesz wypłacić ");
        money = scanner.nextInt();
        if (balance >= money) {
            balance = balance - money;
            System.out.println("Twoj stan konta po wypłacie to: " + balance);
        } else {
            System.out.println("Kwota wypłaty przewyższa twój stan konta");
        }
    }

    void transfer(BankAccount name) {
        int moneyTransfer;
        System.out.println("Podaj kwotę przelewu: ");
        moneyTransfer = scanner.nextInt();
        if (balance >= moneyTransfer) {
            balance = balance - moneyTransfer;
            name.balance += moneyTransfer;
            System.out.println("Twoj stan konta po wypłacie to: " + balance);

        } else {
            System.out.println("Kwota przelewu przewyższa twój stan konta");
        }
    }
//
//    void wypiszHistorieOperacji() {
//        System.out.println(bankAccountsHistory[Integer.parseInt(name)]);
//
//    }

}



