package com.ecommerce.microcommerce.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.dao.repository.ProductRepository;
import org.junit.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productServiceImpl;

    @Mock
    private ProductRepository productRepositoryMock;

    @Mock
    private ProductRatingService productRatingServiceMock;


    @Test
    @DisplayName("Test de la methode de retour de la liste des produits ")
    public void testProductreturnsAllItemsFromRepository() {

        //GIVEN
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, new String("Ordinateur portable"), 350, 120, "0"));
        products.add(new Product(2, new String("Aspirateur Robot"), 500, 120, "0"));
        products.add(new Product(3, new String("Table de Ping Pong"), 500, 120, "0"));
        when(productRepositoryMock.findAll()).thenReturn(products);
        //WHEN
         List<Product> result = productServiceImpl.ViewAllProduct();

        //THEN
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0).getNom()).isEqualTo("Ordinateur portable");
        assertThat(result.get(1).getNom()).isEqualTo("Aspirateur Robot");
    }

    @Test
    @DisplayName("Test de la methode d'ajout du rating produit à partir d'une liste de produit")
    public void testProductreturnsRating() {
        //GIVEN
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, new String("Ordinateur portable"), 350, 120, "0"));
        when(productRatingServiceMock.getProductRating(products.get(0).getNom())).thenReturn("10");
        //ou : ...getProductRating(any(String.class)))
        //WHEN
        productServiceImpl.assignRating(products);
        //THEN
        assertThat(products.get(0).getRating()).isEqualTo("10");
    }
}
