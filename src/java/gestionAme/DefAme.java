/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionAme;

import Connexion.SqlConnect;
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
    private final SqlConnect connec;
    
    public DefAme(String prenom, String nom, int karma,SqlConnect myBase) {
        this.prenom = prenom;
        this.nom = nom;
        this.karma = karma;
        this.connec = myBase;
        connec.connect();
    }
    
    public void init() {
        DefAme brrr = new DefAme("Gilles","French",42,connec);
    }
    
    public void ajoutDansBDD () {
        String sql="INSERT INTO Ame VALUES (NULL,"+this.nom+","+this.prenom+","+this.karma+");";
        connec.query(sql);
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
