package com.ecommerce.microcommerce.repository;

import com.ecommerce.microcommerce.domain.Panier;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PanierRepository extends JpaRepository <Panier, Integer> {

    Panier findById(int id);

}
