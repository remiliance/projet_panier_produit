package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.repository.ClientRepository;
import com.ecommerce.microcommerce.dao.domain.Client;
import com.ecommerce.microcommerce.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class ClientController {

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/addClient")
    public String addClient() {
        logger.info("GET /add client called");

        return "jsp/addClient";
    }

    @PostMapping(value = "/addClient")
    public ModelAndView addPerson(@RequestParam(value = "nom") String nom) {

        logger.info("POST /add client called");

        clientService.AddClient(nom);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsp/confirmAddClient");
        mv.addObject("nom", nom);
        return mv;
    }

    @RequestMapping(value = {"/viewClient"}, method = RequestMethod.GET)
    public ModelAndView VoirListeClient(ModelAndView mv) {

        logger.info("Get /View Clien");

        List<Client> watchlist = clientService.ViewAllClient();
        mv.setViewName("jsp/result");
        mv.addObject("watchlist", watchlist);
        return mv;

    }
}
