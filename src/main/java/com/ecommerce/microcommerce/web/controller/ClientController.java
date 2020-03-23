package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.ClientDao;
import com.ecommerce.microcommerce.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;

@Controller
public class ClientController {

        @Autowired
        private ClientDao clientdao;


        @GetMapping(value = "/addClient")
        public String addClient() {
            return "addClient";
        }


        @PostMapping(value = "/addClient")
        public ModelAndView addPerson(@RequestParam(value = "nom") String nom) {
            Client p1 = new Client();
            p1.setNom(nom);
            clientdao.save(p1);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("confirm");
            mv.addObject("nom", nom);
            return mv;
        }
//NE MARCHE PAS
        @GetMapping(value = "/showAll")
        public Object showAll() {
            Iterable<Client> clients = clientdao.findAll();
            MappingJacksonValue clientFiltres = new MappingJacksonValue(clients);

            if (clients == null)
                return ResponseEntity.noContent().build();

            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(clients)
                    .toUri();


            ModelAndView mv = new ModelAndView();
             mv.setViewName("result");
            mv.addObject("clients", clientFiltres);
            return mv;
        }
// NE MARCHE PAS
        @GetMapping(value = "/showOne")
        public ModelAndView showOne() {
            Client client2 = clientdao.findById(1);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("result");
            mv.addObject("client", client2);
            return mv;
        }


}
