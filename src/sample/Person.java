package sample;

/**
 * Created by JamesHartanto on 3/10/17.
 */
import java.util.Random;

public class Person {
    private String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;

    public int getBet() {
        return this.bet;
    }

    private int bet;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }



    // Player place bet and sees if they win
    public void setBet(int betAmount) {
         this.bet = betAmount;
    }
}