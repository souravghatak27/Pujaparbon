package com.pujaparbon.customer.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pujaparbon.customer.beans.Customer;
import com.pujaparbon.customer.entities.CustomerEntity;
import com.pujaparbon.customer.repositories.CustomerRepository;




@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		CustomerEntity cust=cutomertoCustomerEntity(customer);
		//validate phone
		//validate pin
		
		Customer customer1=cutomerEntitytoCustomer(customerRepository.save(cust));
		return customer1;
	}
	
	public Customer updateCustomer(Customer customer,Integer userId) throws Exception {
		
		CustomerEntity cust=customerRepository.findById(userId).orElseThrow(() -> new Exception("USer id not found"+ userId));
		cust.setCustomerName(customer.getCustomerName());
		cust.setCustomerAddress(customer.getCustomerAddress());
		cust.setCustomerCountry(customer.getCustomerCountry());
		cust.setCustomerState(customer.getCustomerState());
		cust.setCustomerPin(customer.getCustomerPin());
		cust.setCustomerEmail(customer.getCustomerEmailId());
		cust.setCustomerName(customer.getCustomerName());
		cust.setCustomerPhone(customer.getCustomerPhoneNumber());
		cust.setIsCustomer(customer.getIsCustomer());
		cust.setIsPurohit(customer.getIsPurohit());
		cust.setIsVendor(customer.getIsVendor());
		cust.setCustomerlandmark(customer.getCustomerLandmark());
		cust.setCustomerdisctrict(customer.getCustomerDistrict());
		
		Customer customer1=cutomerEntitytoCustomer(customerRepository.save(cust));
		return customer1;
	}

	
	
	  public List<Customer> getAllCustomers() {
	  
	  List<CustomerEntity> customers= customerRepository.findAll();
	  List<Customer> customerDetails=customers.stream().map(customerEntity->cutomerEntitytoCustomer(customerEntity)).collect(Collectors.toList());
	  
	  return customerDetails; }
	 
	
	public CustomerEntity cutomertoCustomerEntity(Customer customer)
	{
		CustomerEntity custEntity= new CustomerEntity();
		custEntity.setId(customer.getId());
		custEntity.setCustomerAddress(customer.getCustomerAddress());
		custEntity.setCustomerCountry(customer.getCustomerCountry());
		custEntity.setCustomerState(customer.getCustomerState());
		custEntity.setCustomerPin(customer.getCustomerPin());
		custEntity.setCustomerEmail(customer.getCustomerEmailId());
		custEntity.setCustomerName(customer.getCustomerName());
		custEntity.setCustomerPhone(customer.getCustomerPhoneNumber());
		custEntity.setIsCustomer(customer.getIsCustomer());
		custEntity.setIsPurohit(customer.getIsPurohit());
		custEntity.setIsVendor(customer.getIsVendor());
		custEntity.setCustomerlandmark(customer.getCustomerLandmark());
		custEntity.setCustomerdisctrict(customer.getCustomerDistrict());
	
		return custEntity;
		
	}
	
	public Customer cutomerEntitytoCustomer(CustomerEntity customer)
	{
		Customer cust= new Customer();
		cust.setId(customer.getId());
		cust.setCustomerAddress(customer.getCustomerAddress());
		cust.setCustomerCountry(customer.getCustomerCountry());
		cust.setCustomerState(customer.getCustomerState());
		cust.setCustomerPin(customer.getCustomerPin());
		cust.setCustomerEmailId(customer.getCustomerEmail());
		cust.setCustomerName(customer.getCustomerName());
		cust.setCustomerPhoneNumber(customer.getCustomerPhone());
		cust.setIsCustomer(customer.getIsCustomer());
		cust.setIsPurohit(customer.getIsPurohit());
		cust.setIsVendor(customer.getIsVendor());
		cust.setCustomerLandmark(customer.getCustomerlandmark());
		cust.setCustomerDistrict(customer.getCustomerdisctrict());
	
		return cust;
		
	}
	
}
