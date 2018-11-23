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
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

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

    private String amePrenom;
    private String ameNom;
    private Ame ameTest;

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

    public List<Ame> getTout() {
        return ameDAO.findAll();
    }
    
    public void suppr(Ame ame){
        ameDAO.remove(ame);
    }

    public List getBien() {
        return getTout()
                .stream()
                .filter(value -> value.getIdPlace() == 1)
                .collect(Collectors.toList());
    }

    public List<Ame> getPurg() {
        return getTout()
                .stream()
                .filter(value -> value.getIdPlace() == 3)
                .collect(Collectors.toList());
    }

    public List<Ame> getMal() {
        return getTout()
                .stream()
                .filter(value -> value.getIdPlace() == 2)
                .collect(Collectors.toList());
    }
    
    public void getByPersonne() {
        List<Ame> MERDE = getTout();
        for (int i = 0; i < MERDE.size(); i++) {
            if ((MERDE.get(i).getNom() == null ? this.getAmeNom() == null : MERDE.get(i).getNom().equals(this.getAmeNom())) 
                    & (MERDE.get(i).getPrenom() == null ? this.getAmePrenom()== null : MERDE.get(i).getPrenom().equals(this.getAmePrenom()))) {
                ameTest=MERDE.get(i);
            }
        }        
    }
    
    public void creerAme(String nom, String prenom, int karma) {
        Ame newAme = new Ame();
        newAme
                .setNom(nom)
                .setPrenom(prenom)
                .setKarma(karma)
                .setIdPlace(karma > 0 ? 1 : karma < 0 ? 2 : 3)
                .setIdAme(ameDAO.count() + 1);
        ameDAO.create(newAme);
    }    

    public Ame getAmeTest() {
        return ameTest;
    }

    public void setAmeTest(Ame ameTest) {
        this.ameTest = ameTest;
    }
    
    public void reinit() {
        this.ameNom="";
        this.amePrenom="";
    }
}
