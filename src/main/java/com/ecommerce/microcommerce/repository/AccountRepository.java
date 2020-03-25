package com.ecommerce.microcommerce.repository;

import com.ecommerce.microcommerce.domain.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
