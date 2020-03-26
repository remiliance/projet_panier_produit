package com.ecommerce.microcommerce.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@ConditionalOnProperty(name = "app.environment", havingValue = "prod")
@Service
public class ProductRatingServiceImpl implements ProductRatingService {

        String apiUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=dd01726a&t=";

        public String getProductRating(String title) {

            try {
                RestTemplate template = new RestTemplate();

                ResponseEntity<ObjectNode> response =
                        template.getForEntity(apiUrl + title, ObjectNode.class);

                ObjectNode jsonObject = response.getBody();

                return jsonObject.path("imdbRating").asText();
            } catch (Exception e) {
                System.out.println("Something went wront while calling OMDb API" + e.getMessage());
                return null;
            }
        }

    }

