package com.ecommerce.microcommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.schema.Model;

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







