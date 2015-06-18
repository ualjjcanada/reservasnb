/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ual.cnsa.reservas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Joaquin
 */
@Stateless
public class TipohabitacionFacade extends AbstractFacade<Tipohabitacion> {
    @PersistenceContext(unitName = "es.ual.cnsa_reservas_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipohabitacionFacade() {
        super(Tipohabitacion.class);
    }
    
}
