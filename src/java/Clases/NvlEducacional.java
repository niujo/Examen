package Clases;
// Generated 24-jun-2018 15:53:36 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * NvlEducacional generated by hbm2java
 */
public class NvlEducacional  implements java.io.Serializable {


     private Integer idNivel;
     private String nomEducacion;
     private Set clientes = new HashSet(0);

    public NvlEducacional() {
    }

    public NvlEducacional(String nomEducacion, Set clientes) {
       this.nomEducacion = nomEducacion;
       this.clientes = clientes;
    }
   
    public Integer getIdNivel() {
        return this.idNivel;
    }
    
    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }
    public String getNomEducacion() {
        return this.nomEducacion;
    }
    
    public void setNomEducacion(String nomEducacion) {
        this.nomEducacion = nomEducacion;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


