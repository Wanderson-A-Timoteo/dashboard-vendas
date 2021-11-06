package com.wandersontimoteo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wandersontimoteo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
