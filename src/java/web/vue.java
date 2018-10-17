/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import DAO.TrucFacadeLocal;
import Entity.Truc;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.persistence.Table;

/**
 *
 * @author LeRoux
 */
@Named(value = "vue")
@SessionScoped
public class vue implements Serializable {

    @EJB
    TrucFacadeLocal tableDAO;
    
    /**
     * Creates a new instance of vue
     */
    public vue() {
    }
    
    public String getValeur() {
            Truc machin = tableDAO.find(1);
            return machin.getNom();
        }
    
}
