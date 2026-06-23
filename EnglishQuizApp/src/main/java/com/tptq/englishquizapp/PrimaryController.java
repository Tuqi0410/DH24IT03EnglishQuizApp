package com.tptq.englishquizapp;
import com.tptq.utils.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    public void manageQuestions(ActionEvent e) {
        try {
            //  MyAlert.MyAlert.getInstance().showAlert("Coming soon...");
            Stage stage = new Stage();
            Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void pratic(ActionEvent e) {
        MyAlert.MyAlert.getInstance().showAlert("Coming soon...");
    }
    public void exam(ActionEvent e){
        MyAlert.MyAlert.getInstance().showAlert("Coming soon...");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    public void changeTheme(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()){
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style.css").toExternalForm());
        }
    }
}

   
