/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Ame;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LeRoux
 */
@Stateless
public class AmeFacade extends AbstractFacade<Ame> implements AmeFacadeLocal {

    @PersistenceContext(unitName = "ProjetAQE_DUB1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AmeFacade() {
        super(Ame.class);
    }

    @Override
    public List<Ame> findIdplace(int idplace) {
              
        List<Ame> resultList = em.createNativeQuery("select * from ame a where a.idplace = " + idplace)
                .getResultList();
        return resultList;
     }
    
}
