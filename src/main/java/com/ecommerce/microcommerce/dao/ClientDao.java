package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.model.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface ClientDao extends JpaRepository <Client, Integer> {

   Client findById(int id);

}
