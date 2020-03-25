package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.repository.ProductRepository;
import com.ecommerce.microcommerce.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value={"/viewProduct"}, method = RequestMethod.GET)
    public ModelAndView VoirListeProduit() {

        Map<String, Object> model = new HashMap<String, Object>();
        List<Product> watchlist = productRepository.findAll();
       /* List<Product> products = new ArrayList<>();
        products.add(new Product(1, new String ("Ordinateur portable" ), 350, 120));
        products.add(new Product(2, new String ("Aspirateur Robot" ), 500, 120));
        products.add(new Product(3, new String ("Table de Ping Pong" ), 500, 120));*/

        model.put("watchlist", watchlist);
        return new ModelAndView("html/ShowProduct", model);
        }

}
