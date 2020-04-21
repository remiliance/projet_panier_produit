package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.service.ClientServiceImpl;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.DisplayName;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.ecommerce.microcommerce.dao.repository.*;
import com.ecommerce.microcommerce.service.ClientService;
import com.ecommerce.microcommerce.service.ProductServiceImpl;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers={ClientController.class})
public class ClientControllerTest {

   // @Autowired
   // private ClientServiceImpl clientServiceImpl;

    @Autowired
    private  MockMvc mockMvc;

   //@InjectMocks
   //private ClientServiceImpl clientService;
   // @MockBean
   // private ClientService clientService;
   //@InjectMocks
   // private ProductServiceImpl productServiceImpl;
    //@InjectMocks
   // private ClientRepository clientRepository;
   // @InjectMocks
   // private PanierRepository panierRepository;
    //@InjectMocks
   // private Panier_LineRepository panier_lineDaoRepository;
    //@InjectMocks
    //private AccountRepository accountdao;
    //@InjectMocks
    //private ProductRepository productRepository;

/*

    @Test
    @DisplayName("Test l'affichage de la page Clients - result.jsp")
    public void testShowClient() throws Exception {
       mockMvc.perform(get("/viewClient"))
                .andExpect(status().is2xxSuccessful())
               .andExpect(view().name("jsp/result"))
               .andExpect(model().size(2))
               .andExpect(model().attributeExists("watchlist"));
    }

    @Test
    @Disabled
    @DisplayName("Test l'ajout d'un client")
    public void testSubmitNewClient() throws Exception {
        mockMvc.perform(post("/addClient")
                .param("nom", "Remil"))
                .andExpect(view().name("jsp/confirmAddClient"))
                .andExpect(model().attributeExists("nom"))
                .andExpect(model().attribute("nom", "Remil"));
    }

 */
}


