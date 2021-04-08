package com.tcs.internship.assigenment.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.internship.assigenment.bean.StudentBean;
import com.tcs.internship.assigenment.dao.StudentDaoImpl;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDaoImpl db;
	
	@Override
	public List<StudentBean> getAllStudents() throws SQLException {
		List<StudentBean> allStudentDetails = db.getStudentDetail();
		return allStudentDetails;
	}

	@Override
	public StudentBean getStudent(String id) throws SQLException {
		StudentBean student = db.getStudentDetail(id);
		return student;
	}

	@Override
	public void addStudent(StudentBean student) throws SQLException {
		db.addStudent(student);
	}

	@Override
	public void updateStudent(StudentBean student, String id) throws SQLException {
		db.updateStudent(student,id);
	}

	@Override
	public void deleteStudent(String id) throws SQLException {
		db.deleteStudent(id);
	}

}
