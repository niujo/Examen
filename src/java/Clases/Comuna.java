package Clases;
// Generated 24-jun-2018 15:53:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Comuna generated by hbm2java
 */
public class Comuna  implements java.io.Serializable {


     private Integer idComuna;
     private String nomComuna;
     private Set clientes = new HashSet(0);

    public Comuna() {
    }

    public Comuna(String nomComuna, Set clientes) {
       this.nomComuna = nomComuna;
       this.clientes = clientes;
    }
   
    public Integer getIdComuna() {
        return this.idComuna;
    }
    
    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }
    public String getNomComuna() {
        return this.nomComuna;
    }
    
    public void setNomComuna(String nomComuna) {
        this.nomComuna = nomComuna;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


