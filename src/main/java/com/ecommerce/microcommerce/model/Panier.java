package com.ecommerce.microcommerce.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Panier {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="id_client")
    private Client client;

    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="id_panier_line")
    private List<Panier_Line> panier_line = new ArrayList<>();

    public Panier(){
    }

    public Panier(int id, Client client, List<Panier_Line> panier_line) {
        this.id = id;
        this.client = client;
       this.panier_line = panier_line;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Panier_Line> getPanier_line() {
        return panier_line;
    }

    public void setPanier_line(List<Panier_Line> panier_line) {
        this.panier_line = panier_line;
    }
}



