/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Classe {
    protected int id;
    protected String libelle;
    protected ArrayList<Inscription> inscriptions;
    
    public Classe(String libelle){
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", libelle=" + libelle + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ArrayList<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(ArrayList<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
    
    
    
    
    
    
}
