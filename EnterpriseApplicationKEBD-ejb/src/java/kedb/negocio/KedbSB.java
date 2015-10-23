/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedb.negocio;

import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import kedb.entities.KnowError;

/**
 *
 * @author RodrigoL
 */
@Stateless
public class KedbSB implements KedbSBLocal {
@PersistenceContext
EntityManager em;

@Override
public void alta(String nombre) {
    KnowError k = new KnowError();
    k.setName(nombre);
    em.persist(k);
}

}
