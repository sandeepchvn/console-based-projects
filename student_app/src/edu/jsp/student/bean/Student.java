package edu.jsp.student.bean;

import java.io.Serializable;

public class Student implements  Serializable,Comparable<Student>{
	private String name;
	private int id;
	private String section;
	private String blood_group;
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
	@Override
	public String toString() {
		return name+" "+" "+id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

}
