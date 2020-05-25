/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import models.Classe;
import models.Etudiant;
import models.Inscription;

/**
 *
 * @author hp
 */
public interface IGestionInscriptions {
public Inscription addInscription(Inscription i);
public ArrayList<Inscription> listerInscriptions();
public Etudiant rechercherEtudiant(String numero);
public ArrayList<Inscription> listerInscriptions(String annee);
public ArrayList<Inscription> listerInscriptions(Classe classe);
public ArrayList<Inscription> listerInscriptions(Classe classe,String annee);





    
    
}
