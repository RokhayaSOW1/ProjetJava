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
import models.Classe;

/**
 *
 * @author hp
 */
public class ClasseDao implements ISystem<Classe>{
    
   private DaoMysql dao;
   private final String SQL_INSERT="INSERT INTO `classe` (`id_classe`, `libelle`) VALUES (NULL, ?)";
   
   
   public ClasseDao() {
        dao=  DaoMysql.getInstance();
    }
   
   
    @Override
    public int create(Classe obj) {
        int result=0;
      
        try {
            dao.initPS(SQL_INSERT);
            dao.getPstm().setString(1, obj.getLibelle());
            result=dao.executeMaj();
            
            dao.CloseConnection();
             
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return result;
    }

    @Override
    public int update(Classe obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classe findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
