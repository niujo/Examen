/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Claudio Cardenas
 */
@Named(value = "newJSFManagedBean")
@Dependent
public class BeanCliente {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public BeanCliente() {
    }
    
}
