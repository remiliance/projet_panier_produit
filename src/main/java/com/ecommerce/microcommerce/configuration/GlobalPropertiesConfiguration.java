package com.ecommerce.microcommerce.configuration;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
//@Validated
//@PropertySource("classpath:application.properties")
@ConfigurationProperties
public class GlobalPropertiesConfiguration {

   // @Value("${copyright}")
   // @NotEmpty
    private String copyright;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
