package com.tcs.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Address;
import com.tcs.entity.Employee;
import com.tcs.repo.AddressRepo;
import com.tcs.repo.EmployeeRepo;


@Service
public class UserService {

	@Autowired
	private EmployeeRepo  employeeRepo;
	
	@Autowired
	private AddressRepo addressRepo;
	
	
	public void saveData()
	{
		
		/*Employee e = new Employee();
		
	    e.setName("Gowtham");
	    
		e.setAge(26);
		
		
		
		Address a1 = new Address();
		
		a1.setCity("Hyderabad");
		
		a1.setState("Telangana");
		
		//a1.setEmp(e);
		
		Address a2 = new Address();
		
		a2.setCity("Mumbai");
		
		a2.setState("Maharashtra");
		
		
		
		e.addAddress(a1);
		e.addAddress(a2);
		
		
		
		employeeRepo.save(e);*/
		
		
		//addressRepo.saveAll(L);
		
		employeeRepo.deleteById(1);
		
		System.out.println("Data Successfully Inserted");			
		
	}
}
