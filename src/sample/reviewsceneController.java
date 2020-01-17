package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.*;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class reviewsceneController implements Initializable {

    @FXML private Label komuLabel;
    @FXML private Label odkohoLabel;
    @FXML private Label kopieLabel;
    @FXML private Label predmetLabel;
    @FXML private Label obsahLabel;

    @FXML private Label completeLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void poslatObjekt(Email em){
        komuLabel.setText(em.getKomuEmail());
        odkohoLabel.setText(em.getodkohoEmail());
        kopieLabel.setText(em.getkopieEmail());
        predmetLabel.setText(em.getpredmetEmail());
        obsahLabel.setText(em.getObsahEmail());

    }

    public void send_email(ActionEvent event){
        completeLabel.setText("Email byl uspesne odeslan!");
    }

    public void close_client(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void back_to_main2(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene mainScene = new Scene(mainParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }
}
