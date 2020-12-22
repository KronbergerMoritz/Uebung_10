package controller;

import calc.calc;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    private calc calc = new calc();

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
    private TextArea t_output;

    @FXML
    void btn_0(MouseEvent event) {
        t_field.setText(t_field.getText() + "0");

    }

    @FXML
    void btn_1(MouseEvent event) {
        t_field.setText(t_field.getText() + "1");
    }

    @FXML
    void btn_2(MouseEvent event) {
        t_field.setText(t_field.getText() + "2");
    }

    @FXML
    void btn_3(MouseEvent event) {
        t_field.setText(t_field.getText() + "3");
    }

    @FXML
    void btn_4(MouseEvent event) {
        t_field.setText(t_field.getText() + "4");
    }

    @FXML
    void btn_5(MouseEvent event) {
        t_field.setText(t_field.getText() + "5");
    }

    @FXML
    void btn_6(MouseEvent event) {
        t_field.setText(t_field.getText() + "6");
    }

    @FXML
    void btn_7(MouseEvent event) {
        t_field.setText(t_field.getText() + "7");
    }

    @FXML
    void btn_8(MouseEvent event) {
        t_field.setText(t_field.getText() + "8");
    }

    @FXML
    void btn_9(MouseEvent event) {
        t_field.setText(t_field.getText() + "9");
    }

    @FXML
    void btn_clear(MouseEvent event) {
        t_field.setText("");
        t_output.setText("");
        calc.clearStack();
    }


    @FXML
    private void btn_enter()
    {
        String input = t_field.getText();
        if(input.isEmpty() == false)
        {
            double number = Double.parseDouble(input);
            calc.pushStack(number);
            t_field.setText("");
            t_output.setText(calc.getStackList());
        }
    }

    @FXML
    void btn_divid(MouseEvent event) {
    btn_enter();
    if(calc.divid() == true)
    {
        t_output.setText(calc.getStackList());
    }
    }


    @FXML
    void btn_minus(MouseEvent event) {
    btn_enter();
    if(calc.subtract() == true)
    {
        t_output.setText(calc.getStackList());
    }
    }

    @FXML
    void btn_multi(MouseEvent event) {
    btn_enter();
    if(calc.multiply() == true)
    {
        t_output.setText(calc.getStackList());
    }
    }

    @FXML
    void btn_plus(MouseEvent event) {
        btn_enter();
        if(calc.add() == true)
        {
            t_output.setText(calc.getStackList());
        }
    }


}
