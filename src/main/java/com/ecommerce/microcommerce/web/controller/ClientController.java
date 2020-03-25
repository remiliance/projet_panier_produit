package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.ClientDao;
import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.model.Sexe_ref;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClientController {

        @Autowired
        private ClientDao clientdao;



        @GetMapping(value = "/addClient")
        public String addClient() {
            return "jsp/addClient";
        }

        @PostMapping(value = "/addClient")
        public ModelAndView addPerson(@RequestParam(value = "nom") String nom) {
            Client p1 = new Client();
            p1.setNom(nom);
            clientdao.save(p1);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("jsp/confirmAddClient");
            mv.addObject("nom", nom);
            return mv;
        }


    @RequestMapping(value={"/viewClient"}, method = RequestMethod.GET)
    public ModelAndView VoirListeClient(ModelAndView mv){
       List<Client> watchlist =clientdao.findAll();
       mv.setViewName("jsp/result");
        mv.addObject("watchlist", watchlist);
        return mv;

    }
}
