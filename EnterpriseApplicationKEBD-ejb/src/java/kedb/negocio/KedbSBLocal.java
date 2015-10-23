/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedb.negocio;

import javax.ejb.Local;

/**
 *
 * @author RodrigoL
 */
@Local
public interface KedbSBLocal {
    public void alta(String nombre);
}
