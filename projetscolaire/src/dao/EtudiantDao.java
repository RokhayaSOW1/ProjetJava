/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Etudiant;

/**
 *
 * @author hp
 */
public class EtudiantDao implements ISystem<Etudiant>{
   
   private DaoMysql dao;
   private final String SQL_INSERT="INSERT INTO `etudiant` (`id_etudiant`, `matricule`, `nom`, `prenom`) VALUES (NULL, ?, ?, ?)";
   
   public EtudiantDao() {
        dao=  DaoMysql.getInstance();
    }
   
   
    @Override
    public int create(Etudiant obj) {
        int result=0;
      
        try {
            dao.initPS(SQL_INSERT);
            result=dao.executeMaj();
            
            dao.CloseConnection();
             
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return result;
    }

    @Override
    public int update(Etudiant obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Etudiant findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Etudiant> findAll() {
        List<Etudiant> result=null;
        EtudiantDao profildao=new EtudiantDao();
        String sql="select * from etudiant";
     try {
         result=new ArrayList<>();
         dao.initPS(sql);
        ResultSet rs= dao.executeSelect();
        while(rs.next()){
            
        }
     } catch (SQLException ex) {
         Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
     }
        return result;
    }
    
    
}
