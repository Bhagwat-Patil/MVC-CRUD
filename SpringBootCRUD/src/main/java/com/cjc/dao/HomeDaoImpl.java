package com.cjc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao{

	@Autowired
	SessionFactory sf;
	
	@Override
	public int saveData(Student s) {

		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		int id=(int) session.save(s);
		tx.commit();
		return id;
	}

	@Override
	public List<Student> logincheck(String uname, String pass) {

		Session session=sf.openSession();
		if(uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
		{
			Query q=session.createQuery("From Student");
			List<Student> slist=q.getResultList();
			return slist;
		}
		else
		{
			Query q=session.createQuery("From Student where uname=:uname and pass=:pass");
			q.setParameter("uname", uname);
			q.setParameter("pass", pass);
			List<Student> slist=q.getResultList();
			return slist;
		}
	}

	@Override
	public Student editRecord(int id) {

		Session session=sf.openSession();
		Student stu=session.get(Student.class, id);
		return stu;
	}

	@Override
	public List<Student> updateRecord(Student s) {

		Session session=sf.openSession();
		session.update(s);
		session.beginTransaction().commit();
		Query q=session.createQuery("From Student");
		List<Student> slist=q.getResultList();
		return slist;
	}

	@Override
	public List<Student> deleteRecord(int id) {

		Session session=sf.openSession();
		Student stu=session.get(Student.class, id);
		session.beginTransaction();
		session.delete(stu);
		session.getTransaction().commit();
		Query q=session.createQuery("From Student");
		List<Student> slist=q.getResultList();
		return slist;
	}

}
