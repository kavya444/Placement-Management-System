package com.placement.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentService {
	
    private Integer id;         
    private String studentName;  
    private String hallTicketNumber;
    private String college;
    private Long roll;
    private String qualification;
    private String course;
    private int year;
    private String certificate;
    
	
	public StudentService() {
		super();
	}
	
	
	public StudentService(Integer id, String studentName, String hallTicketNumber, String college, Long roll,
			String qualification, String course, int year, String certificate) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.hallTicketNumber = hallTicketNumber;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
	}

    @Id
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getHallTicketNumber() {
		return hallTicketNumber;
	}


	public void setHallTicketNumber(String hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public Long getRoll() {
		return roll;
	}


	public void setRoll(Long roll) {
		this.roll = roll;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCertificate() {
		return certificate;
	}


	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}


	@Override
	public String toString() {
		return "StudentService [id=" + id + ", studentName=" + studentName + ", hallTicketNumber=" + hallTicketNumber
				+ ", college=" + college + ", roll=" + roll + ", qualification=" + qualification + ", course=" + course
				+ ", year=" + year + ", certificate=" + certificate + "]";
	}

    
    
     
}
