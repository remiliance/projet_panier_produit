package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Panier;
import com.ecommerce.microcommerce.model.Panier_Line;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Panier_LineDao extends JpaRepository <Panier_Line, Integer> {

    Panier_Line findById(int id);

    List<Panier_Line> findAll();
}
