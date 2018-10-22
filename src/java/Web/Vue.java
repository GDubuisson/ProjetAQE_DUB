/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import DAO.AmeFacadeLocal;
import DAO.PlaceFacadeLocal;
import entity.Ame;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author LeRoux
 */
@Named(value = "vue")
@SessionScoped
public class Vue implements Serializable {

    @EJB
    AmeFacadeLocal ameDAO;
    PlaceFacadeLocal placeDAO;
    /**
     * Creates a new instance of Vue
     */
    public Vue() {
    }
    
    public String getAmeNom() {
            Ame nomAme = ameDAO.find(1);
            return nomAme.getNom();
    }
    
    public String getAmePrenom() {
            Ame prenomAme = ameDAO.find(1);
            return prenomAme.getPrenom();
    }
    
    public int getAmeKarma() {
            Ame karmaAme = ameDAO.find(1);
            return karmaAme.getKarma();
    }
    
    public String getAll() {
        return getAmeNom()+" "+getAmePrenom()+" "+ getAmeKarma();
    }
}
