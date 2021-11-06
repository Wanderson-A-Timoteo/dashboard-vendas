package com.wandersontimoteo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandersontimoteo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
