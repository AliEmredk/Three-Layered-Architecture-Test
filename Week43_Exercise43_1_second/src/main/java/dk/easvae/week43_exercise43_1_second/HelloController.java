package dk.easvae.week43_exercise43_1_second;

import bll.DataProcessorResponsible;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnReset;

    @FXML
    private TextField nameTxtF;

    @FXML
    private TextField ageTxtF;

    @FXML
    private Label lbl1;

    @FXML
    private Button btn1;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    DataProcessorResponsible dataProcessor = new DataProcessorResponsible();

    public void onBtn1Act(ActionEvent actionEvent) {


        lbl1.setText(dataProcessor.nameChecker(nameTxtF.getText())+ " \n"+ dataProcessor.ageChecker(ageTxtF.getText()));
       // lbl1.setText("Hello, " + nameTxtF.getText() + ", " + ageTxtF.getText());
    }

    public void onBtnResetAct(ActionEvent actionEvent) {
        lbl1.setText(dataProcessor.resetLabels());
    }
}