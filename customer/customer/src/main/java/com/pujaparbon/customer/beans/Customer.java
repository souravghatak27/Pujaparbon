package com.pujaparbon.customer.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class Customer  {



	private Integer id;
	private String customerName;
	private String customerAddress;
	private String customerPin;
	private String customerDistrict;
	private String customerLandmark;
	private String customerState;
	private String customerCountry;
	private String customerPhoneNumber;
	private String customerEmailId;
	private String isCustomer;
	private String isPurohit;
	private String isVendor;
	
	
}
