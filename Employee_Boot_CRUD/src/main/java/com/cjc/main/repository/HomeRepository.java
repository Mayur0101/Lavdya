package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer> {
	
	List<Employee> findByUnameAndPass(String un, String ps);

}
