package crudoperation.service;

import crudoperation.entities.Student;

public interface Studentservice {
	Student findStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(Student student);

}