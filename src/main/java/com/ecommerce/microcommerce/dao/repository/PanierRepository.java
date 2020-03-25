package com.ecommerce.microcommerce.dao.repository;

import com.ecommerce.microcommerce.dao.domain.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepository extends JpaRepository <Panier, Integer> {

    Panier findById(int id);

}
