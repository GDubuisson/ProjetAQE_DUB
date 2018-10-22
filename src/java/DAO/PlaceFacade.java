/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Place;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LeRoux
 */
@Stateless
public class PlaceFacade extends AbstractFacade<Place> implements PlaceFacadeLocal {

    @PersistenceContext(unitName = "ProjetAQE_DUB1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlaceFacade() {
        super(Place.class);
    }
    
}
