package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ListView<?> listview;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_komma;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_enter;

    @FXML
    private Button btn_clear;


    @FXML
    private Button btn_plus;

    @FXML
    private Button btn_minus;

    @FXML
    private Button btn_mal;

    @FXML
    private Button btn_divid;

    @FXML
    private TextField t_field;

    @FXML
    void handle_btn(ActionEvent event) {
    if(event.getSource() == btn_1)
    {
        t_field.setText(t_field.getText() + "1");
    }
    else if(event.getSource() == btn_2)
    {
            t_field.setText(t_field.getText() + "2");
    }
    else if(event.getSource() == btn_3)
    {
        t_field.setText(t_field.getText() + "3");
    }
    else if(event.getSource() == btn_4)
    {
        t_field.setText(t_field.getText() + "4");
    }
    else if(event.getSource() == btn_5)
    {
        t_field.setText(t_field.getText() + "5");
    }
    else if(event.getSource() == btn_6)
    {
        t_field.setText(t_field.getText() + "6");
    }
    else if(event.getSource() == btn_7)
    {
        t_field.setText(t_field.getText() + "7");
    }
    else if(event.getSource() == btn_8)
    {
        t_field.setText(t_field.getText() + "8");
    }
    else if(event.getSource() == btn_9)
    {
        t_field.setText(t_field.getText() + "9");
    }
    else if(event.getSource() == btn_0)
    {
        t_field.setText(t_field.getText() + "0");
    }
    else if(event.getSource() == btn_komma)
    {
        t_field.setText(t_field.getText() + ",");
    }
    else if(event.getSource() == btn_clear)
    {
        t_field.setText(" ");
    }
    }

}
