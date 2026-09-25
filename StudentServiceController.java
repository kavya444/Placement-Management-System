package com.placement.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
	
	@Autowired
	private StudentServiceService StudentService;
	
	//Create
	@PostMapping("/StudentService")
	public void add(@RequestBody StudentService student) {
		StudentService.save(student);
	}
	
	//Retrieve All
	@GetMapping("/StudentService")
    public List<StudentService> listAll(){
		return StudentService.listAll(); 	
    }
	
	//Retrieve By Id
	@GetMapping("/StudentService/{id}")
	public ResponseEntity<StudentService> get(@PathVariable Integer id){
	    try {
	        StudentService studentservice = StudentService.get(id);
	        return new ResponseEntity<>(studentservice, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	//Update
	@PutMapping("/StudentService/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody StudentService student) {
	    try {
	        StudentService existingStudent = StudentService.get(id);

	        existingStudent.setStudentName(student.getStudentName());
	        existingStudent.setHallTicketNumber(student.getHallTicketNumber());
	        existingStudent.setCollege(student.getCollege());
	        existingStudent.setRoll(student.getRoll());
	        existingStudent.setQualification(student.getQualification());
	        existingStudent.setCourse(student.getCourse());
	        existingStudent.setYear(student.getYear());
	        existingStudent.setCertificate(student.getCertificate());

	        StudentService.save(existingStudent);

	        return new ResponseEntity<>(existingStudent, HttpStatus.OK);

	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	
	//Delete
	@DeleteMapping("/StudentService/{id}")
	public void delete(@PathVariable Integer id) {
		StudentService.delete(id);
	}
}
