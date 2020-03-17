package com.ecommerce.microcommerce.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Panier {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="id_client")
    private Client client;

    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="id_panier_line")
    private List<Panier_Line> panier_line = new ArrayList<>();

    public Panier(int id, Client client, Panier_Line panier_line) {
        this.id = id;
        this.client = client;
     //   this.panier_line = panier_line;
    }
}



