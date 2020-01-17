package sample;

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


public class mainsceneController implements Initializable {

    // cas
    @FXML private CheckBox den1;
    @FXML private CheckBox den2;
    @FXML private CheckBox den3;
    @FXML private CheckBox odlisne;
    @FXML private TextField jineText;

    // hodiny
    @FXML private CheckBox hod1;
    @FXML private CheckBox hod2;
    @FXML private CheckBox hod3;
    @FXML private CheckBox hod4;
    @FXML private CheckBox hod5;
    @FXML private CheckBox hod6;
    @FXML private CheckBox hod7;
    @FXML private CheckBox hod8;
    @FXML private CheckBox celyDen;

    // duvod
    @FXML private CheckBox lekar;
    @FXML private CheckBox rodina;
    @FXML private CheckBox zaspal;
    @FXML private CheckBox jineDuvod;
    @FXML private TextField jineDuvodText;

    //komu
    @FXML private CheckBox tridni;
    @FXML private CheckBox rodice;
    @FXML private CheckBox jinePoslat;
    @FXML private TextField jinePoslatText;



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void close_client(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void switch_to_error(ActionEvent event) throws IOException {

        String kdy = "";
        String hodiny = "";
        String duvod = "";
        String komuPoslat = "";

        //kdy
        if (den1.isSelected())
            kdy = "Vcera";
        if (den2.isSelected())
            kdy = "Dnes";
        if (den3.isSelected())
            kdy = "Zitra";
        if (odlisne.isSelected())
            kdy = jineText.getText();

        //hodiny
        if (hod1.isSelected())
            hodiny += "1. ";
        if (hod2.isSelected())
            hodiny += "2. ";
        if (hod3.isSelected())
            hodiny += "3. ";
        if (hod4.isSelected())
            hodiny += "4. ";
        if (hod5.isSelected())
            hodiny += "5. ";
        if (hod6.isSelected())
            hodiny = "6. ";
        if (hod7.isSelected())
            hodiny += "7. ";
        if (hod8.isSelected())
            hodiny += "8. ";
        if (celyDen.isSelected())
            hodiny += "Celý den";

        //duvod
        if (lekar.isSelected())
            duvod = "návštěvě lékaře";
        if (rodina.isSelected())
            duvod = "rodinným důvodům";
        if (zaspal.isSelected())
            duvod = "zaspání";
        if (jineDuvod.isSelected())
            duvod = jineDuvodText.getText();

        //komu poslat
        if (tridni.isSelected())
            komuPoslat = "jan.siegl@educanet.cz";
        if (rodice.isSelected())
            komuPoslat = "";
        if (jinePoslat.isSelected())
            komuPoslat = jinePoslatText.getText();

        Email em = new Email(kdy, hodiny, duvod, komuPoslat);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ReviewScene.fxml"));
        Parent parent = loader.load();

        Scene parentScene = new Scene(parent);

        reviewsceneController controller = loader.getController();
        controller.poslatObjekt(em);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(parentScene);
        window.show();

//        Parent mainParent = FXMLLoader.load(getClass().getResource("ReviewScene.fxml"));
//        mainParent.setController(rC);
//        FXMLLoader loader = new FXMLLoader(
//                getClass().getResource(
//                        "ReviewScene.fxml"
//                )
//        );
//        loader.setController(rC);
//        Parent mainParent = loader.load();
//        Scene mainScene = new Scene(mainParent);
//
//        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        window.setScene(mainScene);
//        window.show();
    }
}
