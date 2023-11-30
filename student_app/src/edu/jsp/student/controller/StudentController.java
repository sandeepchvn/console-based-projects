package edu.jsp.student.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import edu.jsp.student.bean.Student;

public class StudentController {
	private static List<Student> listOfStudent=new ArrayList<Student>();
	public void saveStudent(Student student) {
		listOfStudent.add(student);
	}
	public Student findStudent(int id) {
		Student s=new Student();
		Iterator i=listOfStudent.iterator();
		while(i.hasNext()) {
			s=(Student) i.next();
			if(s.getId()==id)
			{
				return s;
			}
		}
		return null;
//		for (Student s:listOfStudent) {
//			if(s.getId()==id) {
//				return s;
//			}
//		}
//		return null;
	}
	public Student updateStudent(int id,String section) {
		Student s=findStudent(id);
		if(s != null) {
			s.setSection(section);
			return s;
		}
		return null;
	}
	public void deleteStudent(int id) {
		Student s=findStudent(id);
		if(s!=null) {
			listOfStudent.remove(s);
		}
	}
	public List fetchAll() {
		Collections.sort(listOfStudent);
		return listOfStudent;
	}
}
//private String name;
//private int id;
//private String section;
//private String blood_group;
