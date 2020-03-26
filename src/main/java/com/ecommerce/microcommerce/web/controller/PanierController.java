package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.repository.PanierRepository;
import com.ecommerce.microcommerce.dao.domain.Panier;
import com.ecommerce.microcommerce.dao.domain.Panier_Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

// Ne marche pas!
// A refactorer!


@Controller
public class PanierController {

    @Autowired
    PanierRepository panierRepository;

    @GetMapping("/viewPanier/{id}")
    public String VoirPanier(final ModelMap pModel,
                             @RequestParam(value = "id") final int id) {
        Panier panier = panierRepository.findById(id);
        Set<Panier_Line> catalog = panier.getPanier_line();
        pModel.addAttribute("catalog", catalog);
        return "html/ShowPanier";
    }

    @RequestMapping(value = {"/viewPanier"}, method = RequestMethod.GET)
    public String VoirPanier() {
        return "html/ShowPanier";
    }

}
