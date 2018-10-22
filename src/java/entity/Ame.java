/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LeRoux
 */
@Entity
@Table(name = "ame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ame.findAll", query = "SELECT a FROM Ame a")
    , @NamedQuery(name = "Ame.findByIdAme", query = "SELECT a FROM Ame a WHERE a.idAme = :idAme")
    , @NamedQuery(name = "Ame.findByPrenom", query = "SELECT a FROM Ame a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "Ame.findByNom", query = "SELECT a FROM Ame a WHERE a.nom = :nom")
    , @NamedQuery(name = "Ame.findByKarma", query = "SELECT a FROM Ame a WHERE a.karma = :karma")
    , @NamedQuery(name = "Ame.findByIdPlace", query = "SELECT a FROM Ame a WHERE a.idPlace = :idPlace")})
public class Ame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAme")
    private Integer idAme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "karma")
    private int karma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPlace")
    private int idPlace;

    public Ame() {
    }

    public Ame(Integer idAme) {
        this.idAme = idAme;
    }

    public Ame(Integer idAme, String prenom, String nom, int karma, int idPlace) {
        this.idAme = idAme;
        this.prenom = prenom;
        this.nom = nom;
        this.karma = karma;
        this.idPlace = idPlace;
    }

    public Integer getIdAme() {
        return idAme;
    }

    public void setIdAme(Integer idAme) {
        this.idAme = idAme;
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

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAme != null ? idAme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ame)) {
            return false;
        }
        Ame other = (Ame) object;
        if ((this.idAme == null && other.idAme != null) || (this.idAme != null && !this.idAme.equals(other.idAme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ame[ idAme=" + idAme + " ]";
    }
    
}
