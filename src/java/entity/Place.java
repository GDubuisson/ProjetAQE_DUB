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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LeRoux
 */
@Entity
@Table(name = "place")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Place.findAll", query = "SELECT p FROM Place p")
    , @NamedQuery(name = "Place.findByIdPlace", query = "SELECT p FROM Place p WHERE p.idPlace = :idPlace")
    , @NamedQuery(name = "Place.findByNom", query = "SELECT p FROM Place p WHERE p.nom = :nom")})
public class Place implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlace")
    private Integer idPlace;
    @Size(max = 50)
    @Column(name = "nom")
    private String nom;

    public Place() {
    }

    public Place(Integer idPlace) {
        this.idPlace = idPlace;
    }

    public Integer getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(Integer idPlace) {
        this.idPlace = idPlace;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlace != null ? idPlace.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Place)) {
            return false;
        }
        Place other = (Place) object;
        if ((this.idPlace == null && other.idPlace != null) || (this.idPlace != null && !this.idPlace.equals(other.idPlace))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Place[ idPlace=" + idPlace + " ]";
    }
    
}
