package com.tcs.internship.assigenment.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.internship.assigenment.bean.StudentBean;

@Repository
public class StudentDaoImpl {
	
	private List<StudentBean> students= new ArrayList<>(Arrays.asList(
			new StudentBean("4gh17cs032","abc",522),
			new StudentBean("4gh17cs002","xyz",402),
			new StudentBean("4gh17cs012","def",352)
			));
	
	public List<StudentBean> getStudentDetail() throws SQLException {
		return students;
	}

	public StudentBean getStudentDetail(String id) throws SQLException {
//		return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
		return students.stream().filter(s->s.getStudentId().equals(id)).findFirst().get();
	}

	public void addStudent(StudentBean student) throws SQLException {
		students.add(student);
	}

	public void updateStudent(StudentBean student, String id) throws SQLException {
		for(int i=0; i < students.size();i++) {
			StudentBean s =students.get(i);
			if(s.getStudentId().equals(id)) {
				students.set(i, student);
				return;
			}	
		}
	}

	public void deleteStudent(String id) throws SQLException {
		students.removeIf(s -> s.getStudentId().equals(id));
	}

}
