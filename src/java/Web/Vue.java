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
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author LeRoux
 */
@Named(value = "vue")
@ApplicationScoped
public class Vue implements Serializable {
    
    @EJB
    AmeFacadeLocal ameDAO;
    @EJB
    PlaceFacadeLocal placeDAO;
    
    private String amePrenom;
    private String ameNom;
    /**
     * Creates a new instance of Vue
     */
    public Vue() {
    }
    
    public String getAmePrenom() {
        return amePrenom;
    }

    public void setAmePrenom(String amePrenom) {
        this.amePrenom = amePrenom;
    }

    public String getAmeNom() {
        return ameNom;
    }
    
    public void setAmeNom(String ameNom) {
        this.ameNom = ameNom;
    }

    public String getAmeNomBD() {
    Ame nomAme = ameDAO.find(1);
    return nomAme.getNom();
    }
    public String getAmePrenomBD() {
    Ame prenomAme = ameDAO.find(1);
    return prenomAme.getPrenom();
    }
    public int getAmeKarmaBD() {
    Ame karmaAme = ameDAO.find(1);
    return karmaAme.getKarma();
    }

    public List getTout() {
        return ameDAO.findAll();
    }
    
    public List getBien() {
        List<Ame> ames = getTout();
        for (int i = ames.size()-1; i >= 0; i--) {
            if (ames.get(i).getIdPlace()!=1) {
                ames.remove(i);
            }
        }
        return ames;
    }
    
    public List getPurg() {
        List<Ame> ames = getTout();
        for (int i = ames.size()-1; i >= 0; i--) {
            if (ames.get(i).getIdPlace()!=3) {
                ames.remove(i);
            }
        }
        return ames;
    }
    
    public List getMal() {
        List<Ame> ames = getTout();
        for (int i = ames.size()-1; i >= 0; i--) {
            if (ames.get(i).getIdPlace()!=2) {
                ames.remove(i);
            }
        }
        return ames;
    }
    
    public void creerAme(String nom, String prenom, int karma) {
        Ame newAme = new Ame();
        System.out.println("Web.Vue.creerAme()2");
        newAme.setNom(nom);
        System.out.println("Web.Vue.creerAme()3");
        newAme.setPrenom(prenom);
        System.out.println("Web.Vue.creerAme()4");
        newAme.setKarma(karma);
        System.out.println("Web.Vue.creerAme()5");
        if (karma > 0) {
            newAme.setIdPlace(1);
        }
        else if (karma < 0){
            newAme.setIdPlace(2);
        }
        else {
            newAme.setIdPlace(3);
        }
        System.out.println("Web.Vue.creerAme()6");
        newAme.setIdAme(ameDAO.count()+1);
        System.out.println("Web.Vue.creerAme()1");
        ameDAO.create(newAme);
    }
}
