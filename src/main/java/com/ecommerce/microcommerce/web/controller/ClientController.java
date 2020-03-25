package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.repository.ClientRepository;
import com.ecommerce.microcommerce.dao.domain.Client;
import com.ecommerce.microcommerce.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/addClient")
    public String addClient() {
        return "jsp/addClient";
    }

    @PostMapping(value = "/addClient")
    public ModelAndView addPerson(@RequestParam(value = "nom") String nom) {
        clientService.AddClient(nom);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsp/confirmAddClient");
        mv.addObject("nom", nom);
        return mv;
    }

    @RequestMapping(value = {"/viewClient"}, method = RequestMethod.GET)
    public ModelAndView VoirListeClient(ModelAndView mv) {
        List<Client> watchlist = clientService.ViewAllClient();
        mv.setViewName("jsp/result");
        mv.addObject("watchlist", watchlist);
        return mv;

    }
}
