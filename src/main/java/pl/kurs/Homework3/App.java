package pl.kurs.Homework3;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BankAccount tomek = new BankAccount("Tomasz Kowalski", "Mbank", 1410902830576645435l, "98023102081", 0.12, 500);
        BankAccount robert = new BankAccount("Robert Marek", "Santander Bank", 1410902543353524435l, "79061315289", 0.20, 50000);
        BankAccount dominik = new BankAccount("Dominik Saj", "Alior Bank", 1820123123353524435l, "84690602089", 0.05, 200000);

        tomek.cashOut(100);
        tomek.transfer(robert, 100);
        tomek.wypiszHistorieOperacji();
       // robert.wypiszHistorieOperacji();


    }

}
