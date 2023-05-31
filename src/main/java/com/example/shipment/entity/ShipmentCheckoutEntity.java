package com.example.shipment.entity;

import com.example.shipment.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "SHIPMENT_CHECKOUT_TABLE")
public class ShipmentCheckoutEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shipmentId;

	@Column(name = "checkoutId")
	private Long checkoutId;

	@Column(name = "memberId")
	private Long memberId;

	@Column(name = "productId")
	private Long productId;

	@Column(name = "amount")
	private Long amount;

	@Column(name = "shippingAddress")
	private String shippingAddress;
}
