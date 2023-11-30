package com.tyss.student.view;

import java.util.Map;
import java.util.Scanner;

import com.tyss.student.bean.Student;
import com.tyss.student.controller.StudentContoller;

public class StudentView {
	static Scanner sc=new Scanner(System.in);
	public static void printStudent(Student s) {
		System.out.println("id-" + s.getId());
		System.out.println("name-" + s.getName());
		System.out.println("section-" + s.getSection());
		System.out.println("blood group-" + s.getBlood_group());
		System.out.println("--------------------------");
	}

	public static void printAll(Map<Integer, Student> map) {
		for (int key : map.keySet()) {
			Student s = map.get(key);
			printStudent(s);
		}
	}
	public static Student takeStudentData() {
		Student s = new Student();
		s.setId(sc.nextInt());
		s.setName(sc.next());
		s.setBlood_group(sc.next());
		s.setSection(sc.next());
		return s;
	}

	public static void number(int n) {
		if (n == 1) {
			System.out.println("enter id,name,bood group,section");
			
		}
		else if (n == 2)
			System.out.println("enter id");
		else if (n == 3)
			System.out.println("enter id and enter new section");
		else if (n == 4)
			System.out.println("enter id to delete  student");
		else if (n == 5)
			System.out.println("enter id to fetch all Student");
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		StudentContoller scon = new StudentContoller();
		do {
			System.out.println(
					"1. to create student \n2. to find student \n3. to update student \n4. to delete student \n5. to fetch all");
			int num = sc.nextInt();
			number(num);
			switch (num) {
			case 1: {
				scon.saveStudent(takeStudentData());
				break;
			}
			case 2: {
				Student s = scon.findStudent(sc.nextInt());
				printStudent(s);
				break;
			}
			case 3: {
				scon.updateStudent(sc.nextInt(), sc.next());
				break;
			}
			case 4: {
				scon.deleteStudent(sc.nextInt());
				break;
			}
			case 5: {
				printAll(scon.fetchAll());
				break;
			}
			}
			System.out.println("enter y to continue");
		} while ("y".equalsIgnoreCase(sc.next()));
	}
}
