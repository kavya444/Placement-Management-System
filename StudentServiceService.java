package com.placement.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class StudentServiceService {
	
	@Autowired 
	private StudentServiceRepository repository;
	
	//Retrieve All
	public List<StudentService>listAll() {
		return repository.findAll();
	}
	
	//Create
	public void save(StudentService student) {
		repository.save(student);
	}
	
	//Retrieve by Id
	public StudentService get(Integer id)
	{
		return repository.findById(id).get();
	}
	
	//Delete
	public void delete(Integer id)
	{
		repository.deleteById(id);
	}

}
