package com.ecommerce.microcommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sexe_ref {
    @Id
    int sexe_id;
    String sexe;
}
