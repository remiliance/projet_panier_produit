package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.repository.ProductRepository;
import com.ecommerce.microcommerce.dao.domain.Product;
import com.ecommerce.microcommerce.service.ProductService;
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

    private ProductRepository productRepository;
    private ProductService productService;

    @Autowired
    public ProductController(ProductRepository productRepository, ProductService productService) {
        super();
        this.productRepository = productRepository;
        this.productService = productService;
    }
    //*******équivalent à :
   /* @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService; //=new ProductService();*/
    //NB : il faut bien mettre @Service dans les classes appelées

    @RequestMapping(value = {"/viewProduct"}, method = RequestMethod.GET)
    public ModelAndView VoirListeProduitetAssignerRating() {

        Map<String, Object> model = new HashMap<String, Object>();
        List<Product> watchlist = productRepository.findAll();
        productService.assignRating(watchlist);

       /* List<Product> products = new ArrayList<>();
        products.add(new Product(1, new String ("Ordinateur portable" ), 350, 120));
        products.add(new Product(2, new String ("Aspirateur Robot" ), 500, 120));
        products.add(new Product(3, new String ("Table de Ping Pong" ), 500, 120));*/

        model.put("watchlist", watchlist);
        return new ModelAndView("html/ShowProduct", model);
    }

}
