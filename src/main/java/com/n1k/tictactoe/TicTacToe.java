package com.n1k.tictactoe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class TicTacToe extends Application {
    public static int[][] values = new int[3][3];
    public static void main(String[] args) {
         launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    values[i][j] = 2;
                }
            }
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            stage.setTitle("Tic Tac Toe by Nikunj");
            Scene scene = new Scene(root, 1000, 850, Color.CORNSILK);
            stage.setMinHeight(600);
            stage.setMinWidth(600);
            stage.setScene(scene);
            stage.show();
    }

}