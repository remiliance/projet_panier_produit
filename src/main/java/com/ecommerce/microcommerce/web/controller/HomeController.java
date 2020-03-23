package com.ecommerce.microcommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

        @GetMapping(value = "/hello")
        public String sayHello() {
            return "bjr";
        }

}
