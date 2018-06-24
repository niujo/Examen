/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAOs.RentaDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cetecom
 */
@Named(value = "rentaBean")
@SessionScoped
public class RentaBean implements Serializable {

    private Integer idRenta;
    private String nomRenta;

    /**
     * Creates a new instance of RentaBean
     */
    public RentaBean() {
    }

    public List listaRenta() {
        RentaDAO rentaDAO = new RentaDAO();
        return rentaDAO.listaRenta();
    }

    public Integer getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(Integer idRenta) {
        this.idRenta = idRenta;
    }

    public String getNomRenta() {
        return nomRenta;
    }

    public void setNomRenta(String nomRenta) {
        this.nomRenta = nomRenta;
    }
}
