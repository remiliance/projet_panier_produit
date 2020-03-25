package com.ecommerce.microcommerce.dao.repository;

import com.ecommerce.microcommerce.dao.domain.Panier_Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Panier_LineRepository extends JpaRepository <Panier_Line, Integer> {

    Panier_Line findById(int id);

    List<Panier_Line> findAll();
}
