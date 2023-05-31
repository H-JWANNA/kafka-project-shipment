package com.example.shipment.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.example.shipment.dto.CheckoutDto;
import com.example.shipment.entity.ShipmentCheckoutEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ShipmentCheckoutMapper {
	ShipmentCheckoutEntity toEntity(CheckoutDto dto);
}
