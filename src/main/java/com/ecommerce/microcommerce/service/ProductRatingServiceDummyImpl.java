package com.ecommerce.microcommerce.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(name = "app.environment", havingValue = "dev")
@Service
public class ProductRatingServiceDummyImpl implements ProductRatingService {

    @Override
    public String getProductRating(String title) {
        return "9.99";
    }
}
