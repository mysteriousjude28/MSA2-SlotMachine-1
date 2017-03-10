package sample;

import javafx.event.ActionEvent;

public class Controller {
    SlotMachine slotMachine = new SlotMachine();

    public void play(ActionEvent actionEvent) {
        slotMachine.play();
    }
}
