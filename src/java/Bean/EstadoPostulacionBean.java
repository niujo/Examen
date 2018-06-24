/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAOs.EstadoPostulacionDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cetecom
 */
@Named(value = "estadoPostulacionBean")
@SessionScoped
public class EstadoPostulacionBean implements Serializable {

    private Integer idEstado;
    private String nomEstado;

    /**
     * Creates a new instance of ComunaBean
     */
    public EstadoPostulacionBean() {
    }

    public List listaEstadoPostulacion() {
        EstadoPostulacionDAO comunaDAO = new EstadoPostulacionDAO();
        return comunaDAO.listaEstadoPostulacion();
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }
}
