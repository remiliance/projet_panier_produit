package com.ecommerce.microcommerce.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
public class Panier implements Serializable{
    @Id
    @GeneratedValue
    private int id;

    @Column(name="client")


    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="panier_id_depuisPANIER")
    private Set<Panier_Line> panier_line;

    public Panier(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }*/

    public Set<Panier_Line> getPanier_line() {
        return panier_line;
    }

    public void setPanier_line(Set<Panier_Line> panier_line) {
        this.panier_line = panier_line;
    }
}



