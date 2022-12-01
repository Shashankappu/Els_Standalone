package com.shashank.els.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.shashank.els.model.Employee;

@Repository
public interface EmpRepo extends ElasticsearchRepository<Employee,String> {
	
	List<Employee> findByFirstname(String firstName);

}
