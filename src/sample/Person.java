package sample;

/**
 * Created by JamesHartanto on 3/10/17.
 */
import java.util.Random;

public class Person {
    private String name;
    private int money;
    private int bet;


    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getBet() {
        return this.bet;
    }

    public void setBet(int betAmount) {
         this.bet = betAmount;
    }
}