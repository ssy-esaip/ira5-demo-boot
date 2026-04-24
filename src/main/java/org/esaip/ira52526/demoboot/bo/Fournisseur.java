package org.esaip.ira52526.demoboot.bo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NOM")
    private String raisonSociale;

    public Fournisseur() {
    }

    public Fournisseur(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", raisonSociale='" + raisonSociale + '\'' +
                '}';
    }
}
