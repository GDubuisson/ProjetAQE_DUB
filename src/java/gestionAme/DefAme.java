/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionAme;

import Connexion.SqlConnect;

/**
 *
 * @author LeRoux
 */

public class DefAme {

    public String prenom;
    public String nom;
    public int karma;
    private SqlConnect connec;
    
    public DefAme(String prenom, String nom, int karma,SqlConnect myBase) {
        this.prenom = prenom;
        this.nom = nom;
        this.karma = karma;
        this.connec = myBase;
        connec.connect();
    }
    
    public void ajoutDansBDD () {
        String sql="INSERT INTO Ame VALUES (NULL,"+this.nom+","+this.prenom+","+this.karma+");";
        connec.query(sql);
    }
    
}
