package edu.jsp.student.view;

import java.util.Collections;
import java.util.Scanner;

import edu.jsp.student.bean.Student;
import edu.jsp.student.controller.StudentController;

public class StudentView {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StudentController stco=new StudentController();
		
		 do{
			 System.out.println("\"enter 1 to create Student \nenter 2 to fetch Student by id \nenter 3 to update Student section by id \nenter 4 to delete Student by email \nenter 5 to fetch");
			switch(sc.nextInt()) {
			case 1:{
				System.out.println("enter id,name,blood group,section");
				Student s=new Student();
				s.setId(sc.nextInt());
				s.setName(sc.next());
				s.setBlood_group(sc.next());
				s.setSection(sc.next());
				stco.saveStudent(s);
				break;
			}
			case 2:{
				Student s=new Student();
				System.out.println("enter id");
				s=stco.findStudent(sc.nextInt());
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getBlood_group());
				System.out.println(s.getSection());
				break;
			}
			case 3:{
				System.out.println("enter id and new section");
				stco.updateStudent(sc.nextInt(), sc.next());
				break;
			}
			case 4:{
				System.out.println("enter id to delete");
				stco.deleteStudent(sc.nextInt());
				break;
			}
			case 5:{
				System.out.println(stco.fetchAll());
			}
			}
			System.out.println("enter y to continue");
		}while("y".equals(sc.next()));
	}
}
