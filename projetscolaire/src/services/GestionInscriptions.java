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
public class GestionInscriptions implements IGestionInscriptions {
    ArrayList<Inscription> bd= new ArrayList<>();

    @Override
    public Inscription addInscription(Inscription i) {
        bd.add(i);
        return i;
    }

    @Override
    public Etudiant rechercherEtudiant(String numero) {
        for(Inscription i: bd){
            if(i.getEtudiant().getNumero().compareTo(numero) ==0 ){
                return i.getEtudiant();
            }
        }
        return null;
    }

    @Override
    public ArrayList<Inscription> listerInscriptions() {
        return bd;
    }

    @Override
    public ArrayList<Inscription> listerInscriptions(String annee) {
        ArrayList<Inscription> resultat = new ArrayList<>();
        for(Inscription i: bd){
            if(i.getAnnee().compareTo(annee) == 0){
                resultat.add(i);
            }
        }
        
        return resultat;
    }

    @Override
    public ArrayList<Inscription> listerInscriptions(Classe classe) {
        ArrayList<Inscription> resultat = new ArrayList<>();
        for(Inscription i: bd){
            if(i.getClasse()  == classe){
                resultat.add(i);
            }
        }
        
        return resultat;
    }

    @Override
    public ArrayList<Inscription> listerInscriptions(Classe classe, String annee) {
        ArrayList<Inscription> resultat = new ArrayList<>();
        
        ArrayList<Inscription> listerByClasse = listerInscriptions(classe);
        if(listerByClasse != null){
            for(Inscription i : listerByClasse){
            if(i.getAnnee().compareTo(annee) == 0){
                resultat.add(i);
        
            }
        }
        }
        return resultat;
   
    }
    
}
