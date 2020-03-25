package com.ecommerce.microcommerce.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Panier_Line implements Serializable {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



}
