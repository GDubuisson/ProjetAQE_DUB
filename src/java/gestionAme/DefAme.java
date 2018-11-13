/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionAme;

import javax.faces.bean.*;

/**
 *
 * @author LeRoux
 */
@ManagedBean(name="test",eager=true)
public class DefAme {

    public String prenom;
    public String nom;
    public int karma;

    public DefAme() {
    }
    
    public void init() {
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }
    
}
