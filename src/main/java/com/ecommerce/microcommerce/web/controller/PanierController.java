package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.ClientDao;
import com.ecommerce.microcommerce.dao.PanierDao;
import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.model.Panier;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.exceptions.ProduitIntrouvableException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanierController {
  @Autowired
  private PanierDao panierDao;
   @Autowired
    private ClientDao clientDao;

    //Récupérer un produit par son Id
    @ApiOperation(value = "Récupère un panier grâce à son ID à condition que celui-ci soit en stock!")
    @GetMapping(value = "/Panier/{id}")
    public Panier afficherUnPanier(@PathVariable int id) {
        Panier panier = panierDao.findById(id);
      //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
        return panier;
    }

    @ApiOperation(value = "Récupère un panier grâce à son ID à condition que celui-ci soit en stock!")
    @GetMapping(value = "/Client/{id}")
    public Client afficherUnClient(@PathVariable int id) {
        Client client = clientDao.findById(id);
        //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
        return client;
    }




}
