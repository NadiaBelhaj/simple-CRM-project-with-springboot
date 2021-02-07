package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crm.dao.CrmRepository;
import com.crm.model.Customer;

@Service
public class crmService {
	 @Autowired
	    private CrmRepository repo;
	 
	 public List<Customer> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Customer ctr) {
	        repo.save(ctr);
	    }
	     
	    public Customer get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);

}
}
