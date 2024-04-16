package com.pujaparbon.customer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pujaparbon.customer.beans.Customer;
import com.pujaparbon.customer.entities.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {




	
	
}
