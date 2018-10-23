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
import java.util.List;
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
    @EJB
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
        return "Nom : "+getAmeNom()+" / Prénom : "+getAmePrenom()+" / Karma : "+ getAmeKarma();
    }
    
    public void creerAme(String nom, String prenom, int karma) {
        Ame newAme = new Ame();
        newAme.setNom(nom);
        newAme.setPrenom(prenom);
        newAme.setKarma(karma);
        if (karma > 0) {
            newAme.setIdPlace(1);
        }
        else if (karma < 0){
            newAme.setIdPlace(2);
        }
        else {
            newAme.setIdPlace(3);
        }
        newAme.setIdAme(ameDAO.count()+1);
        ameDAO.create(newAme);
    }
    
    public List<Ame> retourneTout() {
        System.err.println("Web.Vue.retourneTout()");
        return ameDAO.findAll();
    }
}
