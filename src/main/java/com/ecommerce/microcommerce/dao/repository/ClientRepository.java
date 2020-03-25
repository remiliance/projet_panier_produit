package com.ecommerce.microcommerce.dao.repository;

import com.ecommerce.microcommerce.dao.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Integer> {

   Client findById(int id);

}
