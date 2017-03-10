package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField betInput;

    SlotMachine slotMachine = new SlotMachine();
    Person player = new Person("Bob",100);

    public void play(ActionEvent actionEvent) {
        int currentBet = Integer.parseInt(betInput.getText());
        player.setBet(currentBet);
        slotMachine.play();
    }
}
