package stackjava.com.sbjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stackjava.com.sbjpa.dao.CustomerDAO;
import stackjava.com.sbjpa.entities.Customer;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public List<Customer> findAll(){
		return customerDAO.findAll();
	}
	
	public Customer findById(final int id) {
		return customerDAO.findById(id);
	}
	
	public void save(final Customer customer) {
		customerDAO.persist(customer);
	}
	
	public void update(final Customer customer) {
		Customer customerDb = customerDAO.findById(customer.getId());
		customerDb.setFull_name(customer.getFull_name());
		customerDb.setAddress(customer.getAddress());
		customerDb.setEmail(customer.getEmail());
		customerDb.setPhone(customer.getPhone());
		customerDAO.persist(customerDb);
	}
	
	public void delete(final int id) {
		Customer customer = customerDAO.findById(id);
		if(customer != null) {
			customerDAO.delete(customer);
		}
	}
}
		






