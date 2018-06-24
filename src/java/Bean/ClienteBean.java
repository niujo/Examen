/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Clases.Cliente;
import Clases.Comuna;
import Clases.EstadoCivil;
import Clases.EstadoPostulacion;
import Clases.NvlEducacional;
import Clases.Renta;
import DAOs.ClienteDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author cetecom
 */
@Named(value = "ClienteBean")
@SessionScoped
public class ClienteBean implements Serializable {

    private Cliente cliente = new Cliente();
    private Comuna comuna = new Comuna();
    private EstadoCivil estadoCivil = new EstadoCivil();
    private EstadoPostulacion estadoPostulacion = new EstadoPostulacion();
    private NvlEducacional nvlEducacional = new NvlEducacional();
    private Renta renta = new Renta();
    private String descripcion;
    private Integer cod_comuna;
    private Integer cod_estadoCivil;
    private Integer cod_epostulacion;
    private Integer cod_nvlEducacional;
    private Integer cod_renta;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }

    public void agregarCliente(Integer cod_comuna, Integer cod_estadoCivil, Integer estado_postulacion, Integer nvl_educacional) {
        comuna.setIdComuna(cod_comuna);
        estadoCivil.setIdEstadoCivil(cod_estadoCivil);
        estadoPostulacion.setIdEstado(cod_epostulacion);
        nvlEducacional.setIdNivel(cod_nvlEducacional);
        renta.setIdRenta(cod_renta);
        Cliente cliente = new Cliente(get);
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.agregarCliente(cliente);
    }

    public void addCliente() {
        cliente.setCodigo(getCod_cliente());
        Cliente cliente = new Cliente(getCodigo(), getMarca(), getDescripcion());
        ClienteDAO ClienteDAO = new ClienteDAO();
        ClienteDAO.agregarCliente(cliente);
    }

    public void insertarCliente() {
        Cliente cliente = new Cliente(getCodigo(), getMarca(), getDescripcion());
        ClienteDAO ClienteDAO = new ClienteDAO();
        ClienteDAO.agregarCliente(cliente);
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cliente
     */
    public Marca getMarca() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setMarca(Marca cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the cod_cliente
     */
    public Short getCod_cliente() {
        return cod_cliente;
    }

    /**
     * @param cod_cliente the cod_cliente to set
     */
    public void setCod_cliente(Short cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

}
