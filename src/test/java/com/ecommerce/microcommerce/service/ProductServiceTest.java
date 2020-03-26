package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.dao.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.*;

//@RunWith(MockitoJUnitRunner.class)
class ProductServiceTest {

 /*  // @Autowired

    @MockBean
    private ProductRepository productRepositoryMock;

    private ProductRatingService productRatingServiceMock;

    @Autowired
    ProductService productService;//= new ProductService(productRepositoryMock,productRatingServiceMock);

   /* @MockBean
    ProductRepository productRepositoryMock;

    @Mock
    ProductRatingService productRatingServiceMock;
*/

   // ProductService productService = new ProductService(productRepositoryMock,productRatingServiceMock);

    @Test
    @DisplayName("Test de la methode de retour de la liste des produits ")
    public void testProductreturnsAllItemsFromRepository() {

        //Arrange
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, new String ("Ordinateur portable" ), 350, 120,"0"));
        products.add(new Product(2, new String ("Aspirateur Robot" ), 500, 120,"0"));
        products.add(new Product(3, new String ("Table de Ping Pong" ), 500, 120,"0"));

//        when(productRepositoryMock.findAll()).thenReturn(products);

        //Act
      //   List<Product> result = productService.ViewAllProduct();
/*
        //Assert
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0).getNom()).isEqualTo("Ordinateur portable");
        assertThat(result.get(1).getNom()).isEqualTo("Aspirateur Robot");
*/
    }
}

