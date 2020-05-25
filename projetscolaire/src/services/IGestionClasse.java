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
public interface IGestionClasse {
    public Classe addClasse(Classe c);
    public ArrayList<Classe> listerCLasse();

    
}
