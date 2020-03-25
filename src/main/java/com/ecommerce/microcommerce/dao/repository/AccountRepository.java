package com.ecommerce.microcommerce.dao.repository;

import com.ecommerce.microcommerce.dao.domain.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
