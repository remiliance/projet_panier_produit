package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, Integer> {
}
