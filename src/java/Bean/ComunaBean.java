/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Clases.Comuna;
import DAOs.ComunaDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cetecom
 */
@Named(value = "comunaBean")
@SessionScoped
public class ComunaBean implements Serializable {

    private Integer idComuna;
    private String nomComuna;

    /**
     * Creates a new instance of ComunaBean
     */
    public ComunaBean() {
    }

    public List listaComunas() {
        ComunaDAO comunaDAO = new ComunaDAO();
        return comunaDAO.listaComunas();
    }

    public Integer getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }

    public String getNomComuna() {
        return nomComuna;
    }

    public void setNomComuna(String nomComuna) {
        this.nomComuna = nomComuna;
    }
}
