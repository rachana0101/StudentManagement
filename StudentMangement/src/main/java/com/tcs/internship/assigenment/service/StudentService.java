package com.tcs.internship.assigenment.service;

import java.sql.SQLException;
import java.util.List;

import com.tcs.internship.assigenment.bean.StudentBean;

public interface StudentService {
	public List<StudentBean> getAllStudents() throws SQLException;
	public StudentBean getStudent(String id) throws SQLException;
	public void addStudent(StudentBean student) throws SQLException;
	public void updateStudent(StudentBean student, String id) throws SQLException;
	public void deleteStudent(String id) throws SQLException;
}
