package com.ecommerce.microcommerce.model;

import javax.persistence.*;

@Entity
public class Panier_Line {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   private String Date;

    @OneToOne (fetch= FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="Product_id",referencedColumnName = "id"),
            @JoinColumn(name="Product_nom",referencedColumnName = "nom"),
    })
    private Product product;

    public Panier_Line(){
    }

}
