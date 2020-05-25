/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Classe;
import models.Etudiant;
import models.Inscription;
import services.GestionInscriptions;

/**
 *
 * @author hp
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/ajoutclasse.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        Classe c1 = new Classe("MAE 3");
        Classe c2 = new Classe("TTL 3");
        Classe c3 = new Classe("LIAGE 3");

        
        GestionInscriptions ge = new GestionInscriptions();
        System.out.println(ge.listerInscriptions());
        
        Etudiant rokhaya = new Etudiant("sow","Rokhaya","E001");
        Inscription i = new Inscription("2020",rokhaya,c1);
        ge.addInscription(i);
        Etudiant paul = new Etudiant("sall","paul","E003");
        Inscription k = new Inscription("2019",paul,c1);
        ge.addInscription(k);
        
        Etudiant safie = new Etudiant("sow","Safie","E002");
        Inscription j = new Inscription("2020",safie,c2);
        ge.addInscription(j);
        //System.out.println(ge.listerInscriptions());
        //System.out.println("Nous allons lister par classe");
        //System.out.println(ge.listerInscriptions(c1));
        //System.out.println(ge.listerInscriptions("2019"));

        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
