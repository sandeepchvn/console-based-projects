package edu.kvg.hostel.sorting;

import java.util.Comparator;

import edu.kvg.hostel.bean.Hostel;

public class HostelSorting implements Comparator<Hostel> {

	@Override
	public int compare(Hostel o1, Hostel o2) {
		
		if (o1.getFees() < o2.getFees()) {
			return -1;
		} else if (o1.getFees() > o2.getFees()) {
			return 1; // for descending order
		} else
			return 0;
	}

}
