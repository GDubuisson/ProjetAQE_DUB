/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Ame;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LeRoux
 */
@Stateless
public class AmeFacade extends AbstractFacade<Ame> implements AmeFacadeLocal {

    @PersistenceContext(unitName = "ProjetAQE_DUBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AmeFacade() {
        super(Ame.class);
    }
    
}
