package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	@OneToMany(mappedBy="emp" ,cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Address> addressList = new ArrayList<>();
	
	public void addAddress(Address address) {
		addressList.add(address);
		address.setEmp(this);
	}
	

}
