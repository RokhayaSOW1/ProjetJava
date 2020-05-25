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
public class Inscription {
    protected Date date;
    protected String annee;
    protected Etudiant etudiant;
    protected Classe classe;

    public Inscription(String annee, Etudiant etudiant, Classe classe) {
        this.annee = annee;
        this.etudiant = etudiant;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Inscription{" + "annee=" + annee + ", etudiant=" + etudiant + ", classe=" + classe + '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    
}
