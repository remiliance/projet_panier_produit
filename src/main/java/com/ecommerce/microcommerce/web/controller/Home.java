package com.ecommerce.microcommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping(value="/index")
    public String VoirIndex() {
        return "html/index";
    }
    @GetMapping(value = "/hello")
    public String sayHello(Model model) {
        model.addAttribute("nom", "Wick");
        return "jsp/bjr";
    }

}







