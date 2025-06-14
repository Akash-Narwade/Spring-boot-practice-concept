package com.training.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@SuppressWarnings("deprecation")
@Entity
@Table(name="ORDR_DTLS")
@Data
public class OrderDetailsEntity {
	
	  @Id
	  @Column(name="ORDER_ID")
	  @GenericGenerator(name="order_id_gen",strategy = "com.training.generators.OrderIdGenerator")
	  @GeneratedValue(generator = "order_id_gen")
      private String orderId;
      
	  @Column(name="ORDER_BY")
      private String orderBy;
      
	  @Column(name="ORDER_PLACED_DT")
	  @Temporal(TemporalType.DATE)
      private Date OrderPlacedDate;
}
