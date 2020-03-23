package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.PanierDao;
import com.ecommerce.microcommerce.model.Panier;
import com.ecommerce.microcommerce.model.Panier_Line;
import io.swagger.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Set;


///////CLASSE A SUPPRIMER PLUS TARD ///////

@RestController
public class ManagePanier {

    @Autowired
    PanierDao panierDao;

    @GetMapping("/viewPanier/{id}")
    public String VoirPanier(final ModelMap pModel,
                             @RequestParam(value="id") final int id) {
        Panier panier = panierDao.findById(id);
        Set<Panier_Line> catalog = panier.getPanier_line();
        pModel.addAttribute("catalog", catalog);
        return "vues/ShowPanier.html";
    }

    @RequestMapping(value={"/viewPanier"}, method = RequestMethod.GET)
    public String VoirPanier() {
        return "vues/ShowPanier.html";
    }


}
