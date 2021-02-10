package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface HomeService {

	public int saveData(Student s);
	
	public List<Student> logincheck(String uname,String pass);
	
	public Student editRecord(int id);
	
	public List<Student> updateRecord(Student s);
	
	public List<Student> deleteRecord(int id);
}
