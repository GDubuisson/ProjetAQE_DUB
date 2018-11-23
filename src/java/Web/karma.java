/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author LeRoux
 */
@Named(value = "karma")
@SessionScoped
public class karma implements Serializable{
    
    private int score = 0;
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
}
