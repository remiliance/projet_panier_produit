package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.domain.Client;
import com.ecommerce.microcommerce.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientdao;

    public void AddClient(String nom)
    {
        Client p1 = new Client();
        p1.setNom(nom);
        clientdao.save(p1);
    }

    public List<Client> ViewAllClient()
    {
        return clientdao.findAll();
    }


}
