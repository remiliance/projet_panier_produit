package com.ecommerce.microcommerce.dao.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Sexe_ref implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String sexe;

    public Sexe_ref() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
