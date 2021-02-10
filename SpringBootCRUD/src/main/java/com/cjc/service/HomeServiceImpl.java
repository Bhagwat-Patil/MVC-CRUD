package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao hd;
	
	@Override
	public int saveData(Student s) {

		return hd.saveData(s);
	}

	@Override
	public List<Student> logincheck(String uname, String pass) {

		return hd.logincheck(uname, pass);
	}

	@Override
	public Student editRecord(int id) {

		return hd.editRecord(id);
	}

	@Override
	public List<Student> updateRecord(Student s) {

		return hd.updateRecord(s);
	}

	@Override
	public List<Student> deleteRecord(int id) {

		return hd.deleteRecord(id);
	}

}
