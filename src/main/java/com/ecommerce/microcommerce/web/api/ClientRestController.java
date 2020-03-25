package com.ecommerce.microcommerce.web.api;

import com.ecommerce.microcommerce.dao.AccountDao;
import com.ecommerce.microcommerce.dao.ClientDao;
import com.ecommerce.microcommerce.dao.PanierDao;
import com.ecommerce.microcommerce.dao.Panier_LineDao;
import com.ecommerce.microcommerce.model.Client;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;


@RestController
public class ClientRestController {

    @Autowired
    private PanierDao panierDao;
    @Autowired
    private ClientDao clientDao;
    @Autowired
    private Panier_LineDao panier_lineDao;
    @Autowired
    private AccountDao accountDao;

    @GetMapping(value = "/Client/{id}")
    public Client afficherUnClient(@PathVariable int id) {
        return clientDao.findById(id);
        //  if(produit==null) throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Écran Bleu si je pouvais.");
    }

    @DeleteMapping(value = "/Client/{id}")
    public void supprimerClient(@PathVariable int id) {

        clientDao.delete(id);
    }

    @RequestMapping(value = "/Clients", method = RequestMethod.GET)
    public MappingJacksonValue listeProduits() {
        Iterable<Client> clients = clientDao.findAll();
        MappingJacksonValue clientFiltres = new MappingJacksonValue(clients);
        return clientFiltres;
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

}
