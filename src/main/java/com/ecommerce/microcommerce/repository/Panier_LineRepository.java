package com.ecommerce.microcommerce.repository;

import com.ecommerce.microcommerce.domain.Panier_Line;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Panier_LineRepository extends JpaRepository <Panier_Line, Integer> {

    Panier_Line findById(int id);

    List<Panier_Line> findAll();
}
