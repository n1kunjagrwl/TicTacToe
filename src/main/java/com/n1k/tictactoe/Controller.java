package com.n1k.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller extends TicTacToe{
    @FXML
    private Label Text;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    int count = 0, i, j;
    int X,Y;

    public void resetIsClicked(ActionEvent e){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                values[i][j] = 2;
            }
        }
        count = 0;
        Text.setText("PLAYER 1 PLAYS \'X\' FIRST");
        btn1.setDisable(false);
        btn1.setText("");
        btn2.setDisable(false);
        btn2.setText("");
        btn3.setDisable(false);
        btn3.setText("");
        btn4.setDisable(false);
        btn4.setText("");
        btn5.setDisable(false);
        btn5.setText("");
        btn6.setDisable(false);
        btn6.setText("");
        btn7.setDisable(false);
        btn7.setText("");
        btn8.setDisable(false);
        btn8.setText("");
        btn9.setDisable(false);
        btn9.setText("");
    }

    public void fill(ActionEvent e){
        if(e.getSource() instanceof Button){
            ((Button)e.getSource()).setDisable(true);
            X = (int)((Button)e.getSource()).getLayoutX();
            Y = (int)((Button)e.getSource()).getLayoutY();
            switch (X) {
                case 0:
                    i = 0;
                    break;
                case 200:
                    i = 1;
                    break;
                case 400:
                    i = 2;
                    break;
            }
            switch (Y) {
                case 0:
                    j = 0;
                    break;
                case 200:
                    j = 1;
                    break;
                case 400:
                    j = 2;
                    break;
            }
            if(count % 2 == 0){
                Text.setText("PLAY 'O'");
                ((Button) e.getSource()).setText("X");
                values[i][j] = 1;
            }
            else {
                Text.setText("PLAY 'X'");
                ((Button) e.getSource()).setText("O");
                values[i][j] = 0;
            }
            count++;
            declareWinner();
            if(count == 9) {
                Text.setText("GAME OVER");
            }
        }
    }

    public void declareWinner(){
        if((values[0][0] == 1 && values[0][1] == 1 && values[0][2] == 1) || (values[1][0] == 1 && values[1][1] == 1 && values[1][2] == 1) || (values[2][0] == 1 && values[2][1] == 1 && values[2][2] == 1) ||
                (values[0][0] == 1 && values[1][0] == 1 && values[2][0] == 1) ||(values[0][1] == 1 && values[1][1] == 1 && values[2][1] == 1) ||(values[0][2] == 1 && values[1][2] == 1 && values[2][2] == 1) ||
                (values[0][0] == 1 && values[1][1] == 1 && values[2][2] == 1) ||(values[0][2] == 1 && values[1][1] == 1 && values[2][0] == 1)){
                    Text.setText("PLAYER 1 WON!");
        }
        if((values[0][0] == 0 && values[0][1] == 0 && values[0][2] == 0) || (values[1][0] == 0 && values[1][1] == 0 && values[1][2] == 0) || (values[2][0] == 0 && values[2][1] == 0 && values[2][2] == 0) ||
                (values[0][0] == 0 && values[1][0] == 0 && values[2][0] == 0) ||(values[0][1] == 0 && values[1][1] == 0 && values[2][1] == 0) ||(values[0][2] == 0 && values[1][2] == 0 && values[2][2] == 0) ||
                (values[0][0] == 0 && values[1][1] == 0 && values[2][2] == 0) ||(values[0][2] == 0 && values[1][1] == 0 && values[2][0] == 0)){
            Text.setText("PLAYER 2 WON!");
        }
    }
}
