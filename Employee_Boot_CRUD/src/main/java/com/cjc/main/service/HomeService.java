package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface HomeService {

	void saveData(Employee e);

	List<Employee> loginData(String un, String ps);

}
