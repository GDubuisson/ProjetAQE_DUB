/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
@Table(name = "truc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Truc.findAll", query = "SELECT t FROM Truc t")
    , @NamedQuery(name = "Truc.findById", query = "SELECT t FROM Truc t WHERE t.id = :id")
    , @NamedQuery(name = "Truc.findByNom", query = "SELECT t FROM Truc t WHERE t.nom = :nom")
    , @NamedQuery(name = "Truc.findByPrenom", query = "SELECT t FROM Truc t WHERE t.prenom = :prenom")
    , @NamedQuery(name = "Truc.findByAge", query = "SELECT t FROM Truc t WHERE t.age = :age")})
public class Truc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "age")
    private Integer age;

    public Truc() {
    }

    public Truc(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Truc)) {
            return false;
        }
        Truc other = (Truc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Truc[ id=" + id + " ]";
    }
    
}
