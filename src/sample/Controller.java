package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    public TextField betInput;
    public Label wheelOne;
    public Label wheelTwo;
    public Label wheelThree;
    public Label playerMoneyAmount;
    public ChoiceBox betPicker;
//    private List<String> letters = new ArrayList<>();


    SlotMachine slotMachine = new SlotMachine();
    Person player = new Person("Bob",150);

    public void play(ActionEvent actionEvent) {
//        letters = Arrays.asList("a","b","c","d");
//        if (!betInput.getText().isEmpty()|| !letters.contains(betInput.getText())) {
        if (!betInput.getText().isEmpty()){
            int currentBet = Integer.parseInt(betInput.getText());
            if (currentBet > 0 && player.getMoney() > 0 && currentBet < player.getMoney()) {
                player.setBet(currentBet);
                slotMachine.play();
                wheelOne.setText(String.valueOf(slotMachine.getWheelOne()));
                wheelTwo.setText(String.valueOf(slotMachine.getWheelTwo()));
                wheelThree.setText(String.valueOf(slotMachine.getWheelThree()));

                if (slotMachine.didBonusHit()) {
                    player.setMoney(player.getMoney() + player.getBet() * 2);
                    playerMoneyAmount.setText(String.valueOf(player.getMoney()));
                } else if (slotMachine.didPlayerWin()) {
                    player.setMoney(player.getMoney() + player.getBet());
                    playerMoneyAmount.setText(String.valueOf(player.getMoney()));
                } else {
                    player.setMoney(player.getMoney() - player.getBet());
                    playerMoneyAmount.setText(String.valueOf(player.getMoney()));
                    System.out.println("You Lost");
                }

            } else System.out.println("Invalid bet");
        }
    }
}

// Option for better chance to win: uncomment line 54 - 60 in SlotMachine.java & change lines 28 - 39 to code below
/*
            if (slotMachine.didBonusHit()) {
                player.setMoney(player.getMoney() + player.getBet() * 3);
                    playerMoneyAmount.setText(String.valueOf(player.getMoney()));
            } else if (slotMachine.didPlayerWin()) {
                player.setMoney(player.getMoney() + player.getBet() * 2);
                playerMoneyAmount.setText(String.valueOf(player.getMoney()));
            } else if (slotMachine.didTwoMatch()) {
                player.setMoney(player.getMoney() + player.getBet());
                playerMoneyAmount.setText(String.valueOf(player.getMoney()));
            }else {
                player.setMoney(player.getMoney() - player.getBet());
                playerMoneyAmount.setText(String.valueOf(player.getMoney()));
                System.out.println("You Lost");
            }
 */