package com.ecommerce.microcommerce.web.api;

import com.ecommerce.microcommerce.repository.*;
import com.ecommerce.microcommerce.domain.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PanierRestController {
  @Autowired
  private PanierRepository panierRepository;

    @Autowired
    private Panier_LineRepository panier_lineRepository;
    @Autowired
    private AccountRepository accountRepository;

    //Récupérer un produit par son Id
    @ApiOperation(value = "Récupère un panier grâce à son ID à condition que celui-ci soit en stock!")
    @GetMapping(value = "/Panier/{id}")
    public Panier afficherUnPanier(@PathVariable int id) {
        Panier panier = panierRepository.findById(id);
      //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
        return panier;
    }



    @DeleteMapping (value = "/Panier/{id}")
    public void supprimerPanier(@PathVariable int id) {

        //clientDao.delete(id);
      panierRepository.delete(id);
    }

    @RequestMapping(value = "/PanierLine", method = RequestMethod.GET)
    public List<Panier_Line> listePanierLine() {
        return panier_lineRepository.findAll();
    }



}
