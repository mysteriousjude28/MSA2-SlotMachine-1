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

    public int currentMoney(Person person, int betAmount){
        int winnings = setBet(betAmount);
        return (person.money - betAmount + winnings);
    }

    // Player place bet and sees if they win
    public int setBet(int betAmount) {
        int playerBet = betAmount;
        int winnings = slotResults(betAmount, slotMachine.didPlayerWin(), slotMachine.didBonusHit());
        return winnings;
    }

    // Slot machine results
    public int slotResults(int betAmount, boolean slotMachine.didPlayerWin(), boolean slotMachine.didBonusHit()) {
        if (slotMachine.didBonusHit() == true) {
            return betAmount * 2;
        } else if (didPlayerWin() == true) {
            return betAmount;
        } else {
            return 0;
        }
    }



//        // Message for user
//        forceLeave(person);
//        System.out.println("You have " + person.money + " dollars left. " + security(message));

//    // Message after each bet
//    String message = " ";
//    public String forceLeave(Person person) {
//        if (person.money > 0) {
//            String message = "Please keep playing ";
//        } else if (person.money <= -0) {
//            String message = "Please leave the slot machine ";
//        }
//        return security(message);
//    }
//
//    private String security(String message) {
//        return message + this.name;
//    }
}