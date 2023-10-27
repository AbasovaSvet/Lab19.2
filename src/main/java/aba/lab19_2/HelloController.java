package aba.lab19_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


public class HelloController {
    @FXML
    private Label rezL;
    @FXML
    private RadioButton catRB;
    @FXML
    private RadioButton horseRB;
    @FXML
    private RadioButton pigRB;
    @FXML
    private RadioButton cowRB;
    @FXML
    void say() {
        ToggleGroup xxx = new ToggleGroup();
        RadioButton selection = (RadioButton) xxx.getSelectedToggle();
        if (selection == catRB) {
            Cat cat = new Cat();
            rezL.setText(cat.voice);
        }
        if (selection == horseRB) {
            Horse horse = new Horse();
            rezL.setText(horse.voice);
        }
        if (selection == pigRB) {
            Pig pig = new Pig();
            rezL.setText(pig.voice);
        }
        if (selection == cowRB) {
            Cow cow = new Cow();
            rezL.setText(cow.voice);
        }

    }
}