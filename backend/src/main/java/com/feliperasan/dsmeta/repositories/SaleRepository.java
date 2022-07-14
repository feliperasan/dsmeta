package com.feliperasan.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feliperasan.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    
}

