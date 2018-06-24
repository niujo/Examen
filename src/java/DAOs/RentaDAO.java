/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cetecom
 */
public class RentaDAO {  
    public List listaRenta(){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        Query q = sesion.createQuery("from renta");
        List renta = q.list();        
        sesion.flush();
        sesion.close();
        return renta;
    }    
}

