package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoTestMock {
    public static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1, new String ("Ordinateur portable" ), 350, 120));
        products.add(new Product(2, new String ("Aspirateur Robot" ), 500, 120));
        products.add(new Product(3, new String ("Table de Ping Pong" ), 500, 120));
    }

    public static List<Product> findAll(){
        return products;
    }

    public Product ProductfindById (int id){
        for (Product product : products)
            if (product.getId()==id)
            {
                return product;
            }
        return null;
    }

}