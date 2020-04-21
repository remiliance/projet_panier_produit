package com.ecommerce.microcommerce.configuration;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
@PropertySource("classpath:application.properties")
public class ApplicationPropertiesConfiguration {

    @Value("${ratingURL}")
    @NotEmpty
    private String ratingURL;

    public String getRatingURL() {
        return ratingURL;
    }

    public void setRatingURL(String ratingURL) {
        this.ratingURL = ratingURL;
    }
}
