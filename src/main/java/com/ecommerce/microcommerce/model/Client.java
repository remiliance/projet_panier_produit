package com.ecommerce.microcommerce.model;

import javax.persistence.*;


@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    @OneToOne
    @JoinColumn(name="Sexe")
    Sexe_ref sexe;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
