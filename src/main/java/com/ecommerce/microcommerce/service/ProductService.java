package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.Jpa.JpaProductRepository;
import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRatingServiceImpl productRatingServiceImpl;
    private ProductRepository productRepository = new JpaProductRepository();

    @Autowired
    public ProductService(ProductRepository productRepository, ProductRatingServiceImpl productRatingServiceImpl) {
        super();
        this.productRepository = productRepository;
        this.productRatingServiceImpl = productRatingServiceImpl;
    }

    public void assignRating(List<Product> listItems) {
        //  List<Product> listItems = productRepository.findAll();
        for (Product product : listItems) {

            String rating = productRatingServiceImpl.getProductRating(product.getNom());

            if (rating != null) {
                product.setRating(rating);
            }
        }
    }

    public List<Product> ViewAllProduct()
    {
        return productRepository.findAll();
    }

}
