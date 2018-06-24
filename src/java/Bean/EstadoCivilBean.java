/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAOs.EstadoCivilDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author cetecom
 */
@Named(value = "estadoCivilBean")
@SessionScoped
public class EstadoCivilBean implements Serializable {

    private short idEstadoCivil;
    private String nomEstado;

    /**
     * Creates a new instance of EstadoCivilBean*-**
     */
    public EstadoCivilBean() {
    }

    public List listaEstadoCivil() {
        EstadoCivilDAO estadoCivilDAO = new EstadoCivilDAO();
        return estadoCivilDAO.listaEstadoCivil();
    }

    public short getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(short idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

}
