package net.kartik.customer;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll()
	{
		return (List<Customer>) repo.findAll();
	}
	
	public void save(Customer customer)
	{
		repo.save(customer);
	}
	
	public Customer get(Long id) {
        return repo.findById(id).get();
    }
	public void delete(Long id) {
        repo.deleteById(id);
    }
	public List<Customer> search(String keyword) {
	    return repo.search(keyword);
	}
	
}
