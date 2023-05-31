package com.example.shipment.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

public record CheckoutDto(
	Long checkoutId,

	Long memberId,

	Long productId,

	Long amount,

	String shippingAddress,

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	LocalDateTime createdAt
) {
}
