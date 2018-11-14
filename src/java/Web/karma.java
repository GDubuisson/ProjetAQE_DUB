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
import java.util.Date;

/**
 *
 * @author LeRoux
 */
@Named(value = "karma")
@SessionScoped
public class karma implements Serializable{
    
    private int score = 0;
    
    public karma() {
    }
    
    public void ajoutPoints(int score) {
        this.score += score;
    }
    
    public int scoreFinal() {
        return this.score;
    }
    
    public int calculDate(Date ddn, Date ddm) {
        if (ddn == null || ddm == null) {
            ajoutPoints(5);
            return(5);
        }
        else if (((ddm.getTime()-ddn.getTime())/(1000*60*60*24*365))<50){
            ajoutPoints(-5);
            return -5;
        } else {
            ajoutPoints(0);
            return 0;
        }
    }
}
