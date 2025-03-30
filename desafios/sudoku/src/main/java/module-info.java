module com.ricardo.sudoku {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.ricardo.sudoku to javafx.fxml;
    exports com.ricardo.sudoku;
    exports com.ricardo.sudoku.controllers;
    opens com.ricardo.sudoku.controllers to javafx.fxml;
}