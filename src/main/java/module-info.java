module aba.lab19_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens aba.lab19_2 to javafx.fxml;
    exports aba.lab19_2;
}