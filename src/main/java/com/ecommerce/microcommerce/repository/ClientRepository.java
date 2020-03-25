package com.ecommerce.microcommerce.repository;

import com.ecommerce.microcommerce.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {

   Client findById(int id);

}
