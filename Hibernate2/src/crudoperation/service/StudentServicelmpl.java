package crudoperation.service;

import crudoperation.dao.StudentDAO;
import crudoperation.dao.StudentDAOlmpl;
import crudoperation.entities.Student;

public class StudentServicelmpl implements Studentservice {
	private StudentDAO dao;
	
	public  StudentServicelmpl() {
		dao = new StudentDAOlmpl();
	}

	
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		Student student = dao.getStudentById(id);
		
		return student;
	}

	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

}