package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.repository.ClientRepository;
import com.ecommerce.microcommerce.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class ClientController {

        @Autowired
        private ClientRepository clientdao;



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
