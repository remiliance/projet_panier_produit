package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.configuration.AppConfig;
import com.ecommerce.microcommerce.configuration.ApplicationPropertiesConfiguration;
import com.ecommerce.microcommerce.configuration.GlobalPropertiesConfiguration;
import com.ecommerce.microcommerce.dao.repository.ProductRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@ConditionalOnProperty(name = "app.environment", havingValue = "prod")
@Service
public class ProductRatingServiceImpl implements ProductRatingService {

    @Autowired
    private ApplicationPropertiesConfiguration app;

    @Autowired
    private GlobalPropertiesConfiguration global;


       public String getProductRating(String title) {

           //String apiUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=dd01726a&t=";
           // Remplacement par un paramètre de config ratingURL
        String apiUrl=app.getRatingURL();

        Logger logger = LoggerFactory.getLogger(ProductRatingServiceImpl.class);

        try {
            logger.debug("Calling omdbapi with url {} and title {}", apiUrl , title);
            RestTemplate template = new RestTemplate();

            ResponseEntity<ObjectNode> response =
                    template.getForEntity(apiUrl + title, ObjectNode.class);

            ObjectNode jsonObject = response.getBody();
            logger.error("rating found for {} happened!",title);
            return jsonObject.path("imdbRating").asText();
        } catch (Exception e) {
            logger.error("ERROR! Exception happened!",e);
           // logger.error("Valeur" + app.getValeur());
            return null;
        }
    }
}

