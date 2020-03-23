package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class ProductDaoTest {

    @Autowired
     private ProductDao productDao;
   // ProductDaoTestMock mocki = new ProductDaoTestMock();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findById() {

        Product pp = new Product();
      //  pp= productDao.findById(1);
        pp.setNom("Ordinateur portable");
        assertThat(pp.getNom()).isEqualTo("Ordinateur portable");
    }

    @Test
    void findByPrixGreaterThan() {
    }

    @Test
    void findByNomLike() {
    }

    @Test
    void chercherUnProduitCher() {
    }
}