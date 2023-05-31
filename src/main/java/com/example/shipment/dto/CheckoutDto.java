package com.example.shipment.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public record CheckoutDto(
	Long checkoutId,

	Long memberId,

	Long productId,

	Long amount,

	String shippingAddress,

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	LocalDateTime createdAt
) {
}
