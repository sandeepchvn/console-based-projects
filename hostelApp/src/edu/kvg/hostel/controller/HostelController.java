package edu.kvg.hostel.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kvg.hostel.bean.Hostel;
import edu.kvg.hostel.sorting.HostelSorting;

public class HostelController {
	private static List<Hostel> listOfHostel = new ArrayList();

	public void saveHostel(Hostel h) {
		String hName = h.getHostelName().toLowerCase();
		h.setHostelName(hName);
		listOfHostel.add(h);
	}

	public Hostel findHostel(String hostelName) {
		for (Hostel h : listOfHostel) {
			if (h.getHostelName().equalsIgnoreCase(hostelName)) {
				return h;
			}
		}
		return null;
	}

	public boolean updateHostel(String hostelName, int numberOfPeople) {
		Hostel h = findHostel(hostelName);
		if (h != null) {
			h.setNumberOfPeople(numberOfPeople);
			return true;
		}
		return false;
	}

	public boolean delete(String hostelName) {
		Hostel h = findHostel(hostelName);
		if (h != null) {
			listOfHostel.remove(h);
			return true;
		}
		return false;
	}

	public List fetchAll() {
		// List<Hostel> allHostel=listOfHostel;
		return listOfHostel;

	}

	public List<Hostel> descendingOrder() {
		Collections.sort(listOfHostel, new HostelSorting());
		return listOfHostel;
	}
}
