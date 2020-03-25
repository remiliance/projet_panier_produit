package com.ecommerce.microcommerce.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.ecommerce.microcommerce.dao.*;
import org.junit.Test;
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
    public void testShowClient() throws Exception {
       mockMvc.perform(get("/viewClient"))
                .andExpect(status().is2xxSuccessful())
               .andExpect(view().name("jsp/result"))
               .andExpect(model().size(2))
               .andExpect(model().attributeExists("watchlist"));
    }
}
