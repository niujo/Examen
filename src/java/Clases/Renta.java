package Clases;
// Generated 24-jun-2018 15:53:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Renta generated by hbm2java
 */
public class Renta  implements java.io.Serializable {


     private Integer idRenta;
     private String nomRenta;
     private Set clientes = new HashSet(0);

    public Renta() {
    }

    public Renta(String nomRenta, Set clientes) {
       this.nomRenta = nomRenta;
       this.clientes = clientes;
    }
   
    public Integer getIdRenta() {
        return this.idRenta;
    }
    
    public void setIdRenta(Integer idRenta) {
        this.idRenta = idRenta;
    }
    public String getNomRenta() {
        return this.nomRenta;
    }
    
    public void setNomRenta(String nomRenta) {
        this.nomRenta = nomRenta;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


