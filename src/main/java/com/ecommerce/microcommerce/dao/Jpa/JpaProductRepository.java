package com.ecommerce.microcommerce.dao.Jpa;

import com.ecommerce.microcommerce.dao.repository.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaProductRepository implements ProductRepository {

    protected EntityManager entityManager;

    @PersistenceContext
    protected JpaProductRepository setEntityManager (EntityManager entityManager){
        this.entityManager=entityManager;
        return this;
    }

    @Override
    public void methodeaveccode() {

    }
}
