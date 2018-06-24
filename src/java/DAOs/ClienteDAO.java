/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Clases.Cliente;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cetecom
 */
public class ClienteDAO {
    public void agregarCliente(Cliente cliente){
        //Comuna comuna, EstadoCivil estadocivil, EstadoPostulacion estadoPostulacion, NvlEducacional nvlEducacional, Renta renta
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        sesion.save(cliente);
        sesion.getTransaction().commit();
        sesion.flush();
        sesion.close();
    }
    
    public void actualizarCliente(Cliente cliente){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        sesion.update(cliente);
        sesion.getTransaction().commit();
        sesion.flush();
        sesion.close();
    }
    
    public void eliminarCliente(Cliente cliente){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        sesion.delete(cliente);
        sesion.getTransaction().commit();
        sesion.flush();
        sesion.close();
    }

    public List listaClientes(){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        Query q = sesion.createQuery("from cliente");
        List clientes = q.list();        
        sesion.flush();
        sesion.close();
        return clientes;
    }    
    public Cliente buscarCliente(short codigo){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        Query q = sesion.createQuery("from cliente where id_cliente="+codigo);
        Cliente cliente = (Cliente) q.uniqueResult();
        sesion.flush();
        sesion.close();
        return cliente;
    }
}

