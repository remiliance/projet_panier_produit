package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface PanierDao extends JpaRepository <Panier, Integer> {

    Panier findById(int id);

}
