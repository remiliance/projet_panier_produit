package com.ecommerce.microcommerce.service;

import com.ecommerce.microcommerce.dao.Jpa.JpaClientRepository;
import com.ecommerce.microcommerce.dao.domain.Client;
import com.ecommerce.microcommerce.dao.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    public void AddClient(String nom);
    public List<Client> ViewAllClient();
//commentaire
}
