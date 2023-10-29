package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	HomeRepository hr;
	
	public List<Employee> getAllData()
	{
		List<Employee> list = (List<Employee>) hr.findAll();
		return list;
	}

	@Override
	public void saveData(Employee e) {
		
		hr.save(e);
		
	}

	@Override
	public List<Employee> loginData(String un, String ps) {
		
		if(un.equals("ADMIN") && ps.equals("ADMIN"))
		{
			return getAllData();
		}
		else
		{
			List<Employee> list = hr.findByUnameAndPass(un, ps);
			
			return list;
		}
		
		
	}

}
