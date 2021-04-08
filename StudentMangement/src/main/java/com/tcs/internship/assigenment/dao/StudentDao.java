package com.tcs.internship.assigenment.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.internship.assigenment.bean.StudentBean;

public interface StudentDao {
	public List<StudentBean> getStudentDetail() throws SQLException;
	public StudentBean getStudentDetail(String id) throws SQLException ;
	public void addStudent(StudentBean student) throws SQLException;
	public void updateStudent(StudentBean student, String id) throws SQLException;
	public void deleteStudent(String id) throws SQLException;

}
