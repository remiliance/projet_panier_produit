package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.Jpa.JpaProductRepository;
import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.dao.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRatingService productRatingService;
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductRatingService productRatingService) {
        super();
        this.productRepository = productRepository;
        this.productRatingService = productRatingService;
    }

    public void assignRating(List<Product> listItems) {
        //  List<Product> listItems = productRepository.findAll();
        for (Product product : listItems) {

            String rating = productRatingService.getProductRating(product.getNom());

            if (rating != null) {
                product.setRating(rating);
            }
        }    }

    public List<Product> ViewAllProduct()
    {
        return productRepository.findAll();
    }

}
