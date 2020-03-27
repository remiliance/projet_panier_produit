package com.ecommerce.microcommerce.actuator;

import com.ecommerce.microcommerce.service.ProductRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class HealthCheck implements HealthIndicator {

    @Autowired
    ProductRatingService productRatingService;

    @Override
    public Health health() {

        if (productRatingService.getProductRating("Up").isEmpty()) {
            return Health.down().withDetail("Cause", "Service OMDb API is not available").build();
        }

        return Health.up().build();
    }
}
