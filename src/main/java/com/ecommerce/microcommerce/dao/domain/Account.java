package com.ecommerce.microcommerce.dao.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;

    @ManyToOne (fetch=FetchType.LAZY)
    private Client client;
}
