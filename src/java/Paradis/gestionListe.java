/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paradis;

import java.util.*;
import Connexion.SqlConnect;
import gestionAme.DefAme;
/**
 *
 * @author LeRoux
 */
public class gestionListe {

    public gestionListe(DefAme personne,SqlConnect myBase) {
        String pouet = "SELECT idAme FROM Ame WHERE nom="+personne.nom+" AND prenom="+personne.prenom+" AND karma="+personne.karma+";";
        String sql = "INSERT INTO Paradis VALUES (NULL,"+pouet+");";
        myBase.connect();
        myBase.query(sql);
                
    }
    
}
