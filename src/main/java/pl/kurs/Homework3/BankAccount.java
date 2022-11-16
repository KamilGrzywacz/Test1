package pl.kurs.Homework3;

import java.sql.Timestamp;
import java.time.Instant;
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
    private double cash;
    private double moneyTransfer;
    private double cashOut;
    String[] bankAccountsHistory = new String[100];

    Timestamp t1 = Timestamp.from(Instant.now());

    public BankAccount(String name, String nameOfBank, long number, String pesel, double lendingRate, double balance) {
        this.name = name;
        this.nameOfBank = nameOfBank;
        this.number = number;
        this.pesel = pesel;
        this.lendingRate = lendingRate;
        this.balance = balance;

    }


    void cashOut(double cash) {
        if (balance >= cash) {
            balance = balance - cash;
            System.out.println("Stan twojego konta po wypłacie to: " + balance);
            bankAccountsHistory[1] = "Dokonano wypłaty  pieniędzy  na kwote " + cash + " o godzinie: " + t1;
        } else {
            System.out.println("Kwota wypłaty przewyższa twój stan konta");
        }
    }

    void transfer(BankAccount name, double moneyTransfer) {
        if (balance >= moneyTransfer) {
            balance = balance - moneyTransfer;
            name.balance += moneyTransfer;


            System.out.println("Twoj stan konta po wypłacie to: " + balance);
            bankAccountsHistory[0] = "Dokonano transferu pieniędzy na konto " + name + " na kwote " + moneyTransfer + " o godzinie: " + t1;
        } else {
            System.out.println("Kwota przelewu przewyższa twój stan konta");

        }

    }

    void wypiszHistorieOperacji() {
        //for(int i = 0 ; i< 100 ; i++){
        //   if(name = robert ){
        //      bankAccountsHistory[i] = " " +  i + ". Dnia: " + t1 + " wykonano operacje " + cashOut + " na kwote " + cash + " z konta " + name;
        //  }
        // }
        System.out.println(Arrays.deepToString(bankAccountsHistory));


    }

}



