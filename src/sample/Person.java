package sample;

/**
 * Created by JamesHartanto on 3/10/17.
 */
import java.util.Random;

public class Person {
    public String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int money;

    public int getBet() {
        return bet;
    }

    public int bet;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int currentMoney(Person person, int betAmount){
        int winnings = setBet(betAmount);
        return (person.money - betAmount + winnings);
    }

    // Player place bet and sees if they win
    public int setBet(int betAmount) {
        return betAmount;
    }
}