package com.tyss.student.controller;

import java.util.HashMap;
import java.util.Map;

import com.tyss.student.bean.Student;

public class StudentContoller {
	private static Map<Integer, Student> mapOfStudent = new HashMap();

	public void saveStudent(Student student) {
		// student.setName(student.getName().toUpperCase());
		mapOfStudent.put(student.getId(), student);
	}

	public Student findStudent(int id) {
		if (mapOfStudent.containsKey(id)) {
			return mapOfStudent.get(id);//this methods takes the key and returns the value
		}
		return null;
	}

	public boolean updateStudent(int id, String section) {
		if (mapOfStudent.containsKey(id)) {
			Student s = mapOfStudent.get(id);
			s.setSection(section);
			return true;
		}
		return false;
	}

	public boolean deleteStudent(int id) {
		if (mapOfStudent.containsKey(id)) {
			mapOfStudent.remove(id);
			return true;
		}
		return false;
	}

	public Map<Integer,Student> fetchAll() {
		//Map<Integer, Student> map = mapOfStudent;
		return  mapOfStudent;
	}
}
