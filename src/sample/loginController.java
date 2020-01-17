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


public class loginController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void close_client(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void switch_to_main(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("ErrorScene.fxml"));
        Scene mainScene = new Scene(mainParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }
}
