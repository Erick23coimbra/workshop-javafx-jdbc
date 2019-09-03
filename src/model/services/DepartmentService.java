package model.services;

import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List <Department> list = new ArrayList<>();
		list.add(new Department(1,"boook"));
		list.add(new Department(2,"Drink"));
		list.add(new Department(3,"and"));
		list.add(new Department(4,"Money"));
		return list;
	}

}
