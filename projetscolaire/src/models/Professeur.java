/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Professeur extends Personne {
    protected String grade;
    protected ArrayList<Classe> classeEns;
    protected ArrayList<Detail> details;

    public ArrayList<Detail> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Detail> details) {
        this.details = details;
    }


    public Professeur(String nom, String prenom, String numero) {
        super(nom, prenom, numero);
    }

    public ArrayList<Classe> getClasseEns() {
        return classeEns;
    }

    public void setClasseEns(ArrayList<Classe> classeEns) {
        this.classeEns = classeEns;
    }
    

    public int getId() {
        return id;
    }

 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public ArrayList<Classe> listerClasses() {
        ArrayList<Classe> result = new ArrayList<>();
        for(Detail d : this.getDetails()){
            result.add(d.getClasse());
            
        }
        return result;
    }
    
    
    
}
