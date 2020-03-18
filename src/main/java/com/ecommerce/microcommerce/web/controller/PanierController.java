package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.*;
import com.ecommerce.microcommerce.model.*;
import com.ecommerce.microcommerce.web.exceptions.ProduitIntrouvableException;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class PanierController {
  @Autowired
  private PanierDao panierDao;
   @Autowired
    private ClientDao clientDao;
    @Autowired
    private Panier_LineDao panier_lineDao;
    @Autowired
    private AccountDao accountDao;

    //Récupérer un produit par son Id
    @ApiOperation(value = "Récupère un panier grâce à son ID à condition que celui-ci soit en stock!")
    @GetMapping(value = "/Panier/{id}")
    public Panier afficherUnPanier(@PathVariable int id) {
        Panier panier = panierDao.findById(id);
      //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
        return panier;
    }

    @ApiOperation(value = "Récupère un client grâce à son ID à condition que celui-ci soit en stock!")
    @PostMapping(value = "/Client")
    public ResponseEntity<Void> ajouterClient(@Valid @RequestBody Client client) {

      Client clientAdded =  clientDao.save(client);

        if (clientAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clientAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping (value = "/Panier/{id}")
    public void supprimerPanier(@PathVariable int id) {

        //clientDao.delete(id);
      panierDao.delete(id);
    }

    @RequestMapping(value = "/PanierLine", method = RequestMethod.GET)
    public List<Panier_Line> listePanierLine() {
        return panier_lineDao.findAll();
    }

    @GetMapping(value = "/Client/{id}")
    public Client afficherUnClient(@PathVariable int id) {
       return clientDao.findById(id);
        //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
    }

    @DeleteMapping (value = "/Client/{id}")
    public void supprimerClient(@PathVariable int id) {

        clientDao.delete(id);

    }

}
