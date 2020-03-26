package com.ecommerce.microcommerce.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.ecommerce.microcommerce.dao.repository.*;
import com.ecommerce.microcommerce.service.ClientService;
import com.ecommerce.microcommerce.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ClientControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ClientService clientService;
    @MockBean
    private ProductServiceImpl productServiceImpl;
    @MockBean
    private ClientRepository clientRepository;
    @MockBean
    private PanierRepository panierRepository;
    @MockBean
    private Panier_LineRepository panier_lineDaoRepository;
    @MockBean
    private AccountRepository accountdao;
    @MockBean
    private ProductRepository productRepository;

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
    @DisplayName("Test l'ajout d'un client")
    public void testSubmitNewClient() throws Exception {
        mockMvc.perform(post("/addClient")
                .param("nom", "Remil"))
                .andExpect(view().name("jsp/confirmAddClient"))
                .andExpect(model().attributeExists("nom"))
                .andExpect(model().attribute("nom", "Remil"));
    }
}


