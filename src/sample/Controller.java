package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField betInput;
    public Label wheelOne;
    public Label wheelTwo;
    public Label wheelThree;

    SlotMachine slotMachine = new SlotMachine();
    Person player = new Person("Bob",100);

    public void play(ActionEvent actionEvent) {
        int currentBet = Integer.parseInt(betInput.getText());
        player.setBet(currentBet);
        slotMachine.play();
        wheelOne.setText(String.valueOf(slotMachine.getWheelOne()));
        wheelTwo.setText(String.valueOf(slotMachine.getWheelTwo()));
        wheelTwo.setText(String.valueOf(slotMachine.getWheelThree()));


    }
}
