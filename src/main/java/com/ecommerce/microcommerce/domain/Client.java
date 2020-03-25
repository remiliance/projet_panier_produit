package com.ecommerce.microcommerce.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="client_id")
    private Set <Panier> panier;

    @OneToOne
    @JoinColumn(name="sex_boolean")
    private Sexe_ref sexe;

    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name ="client_id")
    private List<Account> accounts= new ArrayList();

    public Client()
    {
    }

    public Client(int id, String nom, Set<Panier> panier, Sexe_ref sexe, List<Account> accounts) {
        this.id = id;
        this.nom = nom;
        this.panier = panier;
        this.sexe = sexe;
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Panier> getPanier() {
        return panier;
    }

    public void setPanier(Set<Panier> panier) {
        this.panier = panier;
    }

    public Sexe_ref getSexe() {
        return sexe;
    }

    public void setSexe(Sexe_ref sexe) {
        this.sexe = sexe;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
