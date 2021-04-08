package com.tcs.internship.assigenment.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.internship.assigenment.bean.StudentBean;
import com.tcs.internship.assigenment.service.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl ss;
	
	@RequestMapping("/Student")
	public List<StudentBean> getAllStudents() throws SQLException{
		return ss.getAllStudents();
	}
	@RequestMapping("/Student/{id}")
	public StudentBean getStudents(@PathVariable String id) throws SQLException{
		return ss.getStudent(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/Student")
	public List<StudentBean> addStudents(@RequestBody StudentBean student) throws SQLException {
		ss.addStudent(student);
		return ss.getAllStudents();
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Student/{id}")
	public List<StudentBean> updateStudents(@RequestBody StudentBean student,@PathVariable String id) throws SQLException {
		ss.updateStudent(student,id);
		return ss.getAllStudents();
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Student/{id}")
	public List<StudentBean> deleteStudents(@PathVariable String id) throws SQLException {
		ss.deleteStudent(id);
		return ss.getAllStudents();
	}
}