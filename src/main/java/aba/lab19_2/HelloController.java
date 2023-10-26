package aba.lab19_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;


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

    public void start() {
        RadioButton cat = catRB;
        RadioButton horse = horseRB;
        RadioButton pig = pigRB;
        RadioButton cow = cowRB;

        if (cat = true)
        {
            Cat cat = new Cat();
            rezL.setText(cat.voice);
        }
        else if  horse.setVisible(true);
        {
            Horse horse = new Horse();
            rezL.setText(horse.voice);
        }
        else if  pigRB.setVisible(true);
        {
            Pig pig = new Pig();
            rezL.setText(pig.voice);
        }
        else if  cowRB.setVisible(true);
        {
            Cow cow = new Cow();
            rezL.setText(cow.voice);
        }
    }

}