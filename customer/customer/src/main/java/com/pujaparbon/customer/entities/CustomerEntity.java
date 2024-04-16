package com.pujaparbon.customer.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String customerName;
	private String customerPin;
	private String customerAddress;
	private String customerEmail;
	private String customerState;
	private String customerCountry;
	private String customerPhone;
	private String customerlandmark;
	private String customerdisctrict;
	private String isPurohit;
	private String isVendor;
	private String isCustomer;
		 

}
