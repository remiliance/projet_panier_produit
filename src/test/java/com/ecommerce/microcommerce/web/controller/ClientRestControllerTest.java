package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.repository.*;
import com.ecommerce.microcommerce.service.ClientService;
import com.ecommerce.microcommerce.service.ProductService;
import org.junit.Test;
import com.ecommerce.microcommerce.dao.domain.Client;

import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//***************************************************
// NB : bien mettre import org.junit.Test et non "api"
//****************************************************
@RunWith(SpringRunner.class)
@WebMvcTest
public class ClientRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClientService clientService;
    @MockBean
    private ProductService productService;
    @MockBean
    private ClientRepository clientRepository;
    @MockBean
    private PanierRepository panierRepository;
    @MockBean
    private Panier_LineRepository panier_lineDaoRepository;
    @MockBean
    private AccountRepository accountRepository;
    @MockBean
    private ProductRepository productRepository;

    @Test
    @DisplayName("Test API Get Clients")
    public void findAll() throws Exception {
        // given
        Client client = new Client();
        client.setId(1);
        client.setNom("Remi");

        List<Client> clients = Arrays.asList(client);
        given(clientRepository.findAll()).willReturn(clients);

        // when + then
        this.mvc.perform(get("/Clients"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'nom': 'Remi'}]"));
    }


}