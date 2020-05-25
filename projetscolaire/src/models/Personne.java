/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected Date datenaissance;
    protected String numero;  

    public Personne(String nom, String prenom, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return "Personne{"
                + "nom=" + nom + 
                ", prenom=" + prenom
                + ", numero=" + numero 
                + '}';
    }
    
}
