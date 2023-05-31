package com.example.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shipment.entity.ShipmentCheckoutEntity;

@Repository
public interface ShipmentCheckoutRepository extends JpaRepository<ShipmentCheckoutEntity, Long> {
}
