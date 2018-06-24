/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Clases.EstadoCivil;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Claudio Cardenas
 */
public class EstadoCivilDAO {
    
    public List listaEstadoCivil(){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        Query q = sesion.createQuery("from estado_civil");
        List estadoCivil = q.list();        
        sesion.flush();
        sesion.close();
        return estadoCivil;
    }    
}
