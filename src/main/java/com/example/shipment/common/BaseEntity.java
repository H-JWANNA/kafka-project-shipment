package com.example.shipment.common;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	/*
	 *	== 사전 설정 ==
	 	@MappedSuperclass : 단순히 상속 받는 자식 클래스에 매핑 정보만 제공하는 부모 클래스
	 	@EntityListeners(AuditingEntityListener.class) : 엔티티를 DB에 적용하기 이전에 콜백을 요청하는 어노테이션
	  	@EnableJpaAuditing : SpringApplication에 추가


	 *	== 시간을 저장하기 위한 설정 ==
	  	@CreatedDate : 엔티티 생성 시 특정 필드를 자동으로 데이터베이스에 매핑
	  	@LastModifiedDate : 엔티티 최종 수정 날짜를 자동으로 데이터베이스에 매핑

	  	@CreationTimestamp : insert 쿼리가 발생할 때 현재 시간 적용
	  	@UpdateTimestamp : update 쿼리가 발생할 때 현재 시간 적용


	 *	== LocalDateTime 데이터를 직렬화, 역직렬화하기 위한 설정 ==
	  	@JsonSerialize(using = LocalDateTimeSerializer.class) : LocalDateTime 직렬화
	  	@JsonDeserialize(using = LocalDateTimeDeserializer.class) : LocalDateTime 역직렬화
	  		-	< 의존성 필요 >
	  		- 	implementation 'com.fasterxml.jackson.datatype:jackson-datatype-jsr310'
			-	implementation 'com.fasterxml.jackson.core:jackson-databind'
	 */

	@CreatedDate
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@Column(name = "createdAt", nullable = false, updatable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@LastModifiedDate
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@Column(name = "lastModifiedAt", nullable = false)
	private LocalDateTime lastModifiedAt = LocalDateTime.now();
}
