package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface HomeDao {

	public int saveData(Student s);
	
	public List<Student> logincheck(String uname,String pass);
	
	public Student editRecord(int id);
	
	public Student createRecord(int id);
	
	public void vivek();
	
	public List<Student> updateRecord(Student s);
	
	public List<Student> deleteRecord(int id);
}
