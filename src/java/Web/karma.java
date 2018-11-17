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
    private Date ddn;
    private Date ddm;
    private boolean HPhy;
    private boolean HMent;
    private boolean autreHand;

    
    public karma() {
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public Date getDdn() {
        return ddn;
    }

    public void setDdn(Date ddn) {
        this.ddn = ddn;
    }

    public Date getDdm() {
        return ddm;
    }

    public void setDdm(Date ddm) {
        this.ddm = ddm;
    }

    public boolean isHPhy() {
        return HPhy;
    }

    public void setHPhy(boolean HPhy) {
        this.HPhy = HPhy;
    }

    public boolean isHMent() {
        return HMent;
    }

    public void setHMent(boolean HMent) {
        this.HMent = HMent;
    }

    public boolean isAutreHand() {
        return autreHand;
    }

    public void setAutreHand(boolean autreHand) {
        this.autreHand = autreHand;
    }
    
    public void calculDate() {
        if (ddn == null || ddm == null) {
            setScore(0);
        }
        else if (((this.ddm.getTime()-this.ddn.getTime())/(1000*60*60*24*365))<50){
            setScore(-10);
        } else {
            setScore(10);
        }
    }
}
