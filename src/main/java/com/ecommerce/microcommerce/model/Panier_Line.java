package com.ecommerce.microcommerce.model;

import javax.persistence.*;

@Entity
public class Panier_Line {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="Product_id",referencedColumnName = "id"),
            @JoinColumn(name="Product_nom",referencedColumnName = "nom"),
    })
    private Product product;
}
