package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.dao.*;
import org.junit.Test;
import com.ecommerce.microcommerce.model.Client;

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

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.junit.jupiter.api.Assertions.*;

//***************************************************
// NB : bien mettre import org.junit.Test et non "api"
//****************************************************
@RunWith(SpringRunner.class)
@WebMvcTest
public class ClientRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ClientDao clientDao;
    @MockBean
    private PanierDao panierDao;
    @MockBean
    private Panier_LineDao panier_lineDaoDao;
    @MockBean
    private AccountDao Accountdao;
    @MockBean
    private ProductDao productDao;

    @Test
    public void findAll() throws Exception {
        // given
        Client client = new Client();
        client.setId(1);
        client.setNom("Remi");

        List<Client> clients = Arrays.asList(client);
        given(clientDao.findAll()).willReturn(clients);

        // when + then
        this.mvc.perform(get("/Clients"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'nom': 'Remi'}]"));
    }
}