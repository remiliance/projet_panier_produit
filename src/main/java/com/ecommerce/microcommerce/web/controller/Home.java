package com.ecommerce.microcommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Home {

        @RequestMapping("/simple")
        @ResponseBody
        public String simple() {
            return "Hello World !";
        }

    @RequestMapping("/details/{name}")
    @ResponseBody
    public String details(@PathVariable String name) {
        return "Hello "+name;
    }

}
