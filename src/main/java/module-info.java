module guilford.edu {
    requires javafx.controls;
    requires javafx.fxml;

    opens guilford.edu to javafx.fxml;
    exports guilford.edu;
}
