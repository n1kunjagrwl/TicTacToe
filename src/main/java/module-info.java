module com.n1k.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.n1k.tictactoe to javafx.fxml;
    exports com.n1k.tictactoe;
}