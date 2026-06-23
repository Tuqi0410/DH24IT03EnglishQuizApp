/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tptq.englishquizapp;

import java.net.ConnectException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            //B1: Nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //B2: mo ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql:''localhost/quizdb, "root", "root");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }    
    
}
