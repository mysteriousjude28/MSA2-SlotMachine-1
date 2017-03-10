package sample;

/**
 * Created by JamesHartanto on 3/10/17.
 */
import java.util.Random;

public class Person {
    public String name;
    public int money;
    public int bet;


    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        return money;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int betAmount) {
        return betAmount;
    }
}