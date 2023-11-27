package edu.cit;

import java.util.List;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Controller c = new Controller();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcom-----------");
		System.out.println("enter user name");
		String userName = sc.next();
		System.out.println("enter password");
		String pass = sc.next();
		if ("sandeep".equals(userName) && "chavan".equals(pass)) {
			do {
				System.out.println("1. to create Employee");
				System.out.println("2. to Update Employee Phone");
				System.out.println("3. to Delete Employee");
				System.out.println("4. to Find Employee by id");
				System.out.println("5. to find all Employee");
				System.out.println("7. to update Employee password");
				System.out.println("6. to find all Employee by Department");

				switch (sc.nextInt()) {
				case 1: {
					Employee e = new Employee();
					System.out.println("enter id");
					e.setId(sc.nextInt());
					System.out.println("enter name");
					e.setName(sc.next());
					System.out.println("enter Phone");
					e.setPhone(sc.nextLong());
					System.out.println("enter password");
					e.setPassword(sc.next());
					System.out.println("enter department");
					e.setDepartment(sc.next());
					c.save(e);
				}
					break;
				case 2: {
					System.out.println("enter id ");
					int id = sc.nextInt();
					System.out.println("eneter new Phone number");
					long nPhone = sc.nextLong();
					Employee e = c.updatePhone(id, nPhone);
					System.out.println(e);
				}
					break;
				case 3: {
					System.out.println("enter id to delete Employee");
					boolean res = c.delete(sc.nextInt());
					if (res) {
						System.out.println("deleted successfully");
					} else {
						System.out.println("id is wrong");
					}
				}
					break;
				case 4: {
					System.out.println("enter id to find the Employee");
					Employee e = c.findById(sc.nextInt());
					System.out.println(e);
				}
					break;
				case 5: {
					List<Employee> listE = c.findAll();
					System.out.println(listE);
				}
					break;
				case 6: {
					System.out.println("enter Department name");
					List<Employee> listE = c.findByDepartment(sc.next());
					if (listE != null) {
						System.out.println(listE);
					} else {
						System.out.println("No employee for given department");
					}
				}
					break;
				case 7: {
					System.out.println("enter id ");
					int id = sc.nextInt();
					System.out.println("eneter new password");
					long nPass = sc.nextLong();
					Employee e = c.updatePhone(id, nPass);
					System.out.println(e);
				}
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: ");
				}

				System.out.println("enter y to perform operation");
			} while ("y".equals(sc.next()));

		} else {
			System.out.println("user name and password is incorrect");
		}
	}
}
