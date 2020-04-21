package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.configuration.GlobalPropertiesConfiguration;
import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.service.ProductService;
import com.ecommerce.microcommerce.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @Autowired
    private GlobalPropertiesConfiguration global;


    @RequestMapping(value = {"/viewProduct"}, method = RequestMethod.GET)
    public ModelAndView VoirListeProduitetAssignerRating() {

        logger.info("GET /View Product called");

        String copyright=global.getCopyright();

        Map<String, Object> model = new HashMap<String, Object>();
        List<Product> watchlist = productService.ViewAllProduct();
        productService.assignRating(watchlist);

        String copy=global.getCopyright();
       /* List<Product> products = new ArrayList<>();
        products.add(new Product(1, new String ("Ordinateur portable" ), 350, 120));
        products.add(new Product(2, new String ("Aspirateur Robot" ), 500, 120));
        products.add(new Product(3, new String ("Table de Ping Pong" ), 500, 120));*/

        model.put("watchlist", watchlist);
        model.put ("copy", copy);
        return new ModelAndView("html/ShowProduct", model);
    }

}
