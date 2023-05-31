package com.example.shipment.service;

import org.springframework.stereotype.Service;

import com.example.shipment.dto.CheckoutDto;
import com.example.shipment.entity.ShipmentCheckoutEntity;
import com.example.shipment.mapper.ShipmentCheckoutMapper;
import com.example.shipment.repository.ShipmentCheckoutRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SaveService {
	private final ShipmentCheckoutRepository shipmentCheckoutRepository;

	private final ShipmentCheckoutMapper mapper;

	public Long save(CheckoutDto checkoutDto) {
		ShipmentCheckoutEntity shipmentCheckout = mapper.toEntity(checkoutDto);
		ShipmentCheckoutEntity savedEntity = shipmentCheckoutRepository.save(shipmentCheckout);

		return savedEntity.getShipmentId();
	}
}
