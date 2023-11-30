package edu.kvg.hostel.view;

import java.sql.Savepoint;
import java.util.List;
import java.util.Scanner;

import edu.kvg.hostel.bean.Hostel;
import edu.kvg.hostel.controller.HostelController;

public class HostelView {
	public static void printHostel(Hostel h) {
		System.out.println(h.getHostelName());
		System.out.println(h.getFees());
		System.out.println(h.getNumberOfPeople());
		System.out.println(h.getRoomNumber());
		System.out.println(h.getWardenName());
		System.out.println(h.getFoodAvailability());
		System.out.println(h.getHotWaterAvailability());
	}
	public static void printAllHostel(List<Hostel> lh ) {
		for(Hostel h:lh) {
			System.out.println("---"+h.getHostelName()+"---");
			System.out.println(h.getFees());
			System.out.println(h.getNumberOfPeople());
			System.out.println(h.getRoomNumber());
			System.out.println(h.getWardenName());
			System.out.println(h.getFoodAvailability());
			System.out.println(h.getHotWaterAvailability());
			System.out.println("----------------------------");
		}
	}

	public static void numbers(int n) {
		if (n==1) 
			System.out.println("enter \nhostal name\nfees\nnumber of peaople\nroom number\nwarden name\nfood availability\nhot water availability");
		else if (n==2) 
			System.out.println("enter hostel name to fetch the hostel");
		else if (n==3) 
			System.out.println("enter hostel name to update number of people");
		else if (n==4) 
			System.out.println("enter hostel name to delete the hostel");
		else if(n==5)
			System.out.println("fetch all Hostels");
		else if(n==6)
			System.out.println("sort fees");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HostelController hc = new HostelController();
		
		do{
			System.out.println(
					"1.to create Hostel \n2.to find Hostel by name\n3.to update hostel by name\n4.to delete hostel by name \n5.fetch all Hostels\n.sort it by fees");
			int key = sc.nextInt();
			numbers(key);
			switch (key) {
			case 1: {
				Hostel h = new Hostel();
				h.setHostelName(sc.next());
				h.setFees(sc.nextInt());
				h.setNumberOfPeople(sc.nextInt());
				h.setRoomNumber(sc.nextInt());
				h.setWardenName(sc.next());
				h.setFoodAvailability(sc.next());
				h.setHotWaterAvailability(sc.next());
				hc.saveHostel(h);
				break;
			}
			case 2: {
				Hostel h = hc.findHostel(sc.next());
				printHostel(h);
				break;
			}
			case 3: {
				hc.updateHostel(sc.next(), sc.nextInt());
				break;
			}
			case 4: {
				hc.delete(sc.next());
				break;
			}
			case 5:{
				List<Hostel> listOfHostel=hc.fetchAll();
				printAllHostel(listOfHostel);
				break;
			}
			case 6:{
				List<Hostel> sortedList=hc.descendingOrder();
				printAllHostel(sortedList);
				break;
			}
			}
			System.out.println("enter y to continue");
		}while ("y".equalsIgnoreCase(sc.next())) ;
	}
}
