package com.pujaparbon.location.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="location")
@NoArgsConstructor
@Getter
@Setter
public class LocationEntity {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String pinNumber;
}
