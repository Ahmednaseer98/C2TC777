package crudoperation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Student")


public class Student {
	
	@Id
	@Column(name="ID")
    private int id;
	
	
	@Column(name="Name")
	private String name;
	
	@Column(name="roll")
	private long roll;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="year")
	private int year;
	
	@Column(name="course")
	private String course;
	
	@Column(name="hallTicketNo")
	private long hallTicketNo;
	
	
	
	public Student() {
		
	}
	
	
	public Student(int id, String name, long roll, String qualification, int year, String course, long hallTicketNo) {
		
		this.id=id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.year = year;
		this.course = course;
		this.hallTicketNo = hallTicketNo;
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getRoll() {
		return roll;
	}


	public void setRoll(long roll) {
		this.roll = roll;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public long getHallTicketNo() {
		return hallTicketNo;
	}


	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}


	
	
	
	
	
	


}