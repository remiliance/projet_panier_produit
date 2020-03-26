package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.domain.Product;

import java.util.List;

public interface ProductService {

    public void assignRating(List<Product> listItems);
    public List<Product> ViewAllProduct();


}
