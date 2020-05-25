/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Inscription;

/**
 *
 * @author hp
 */
public class InscriptionDao implements ISystem<Inscription>{
    
   private DaoMysql dao;
   private final String SQL_INSERT="INSERT INTO `inscription` (`id_inscription`,`id_etudiant`,`id_classe`, `date`, `anneScolaire`) VALUES (NULL, ?, ?, ?)";
   
   public InscriptionDao() {
        dao=  DaoMysql.getInstance();
    }
    
    @Override
    public int create(Inscription obj) {
        
        int result=0;
      
        try {
            dao.initPS(SQL_INSERT);
            dao.getPstm().setInt(1,obj.getEtudiant().getId());
            dao.getPstm().setInt(2,obj.getClasse().getId() );
            result=dao.executeMaj();
            
            dao.CloseConnection();
             
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return result;
    }

    @Override
    public int update(Inscription obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inscription findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Inscription> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
