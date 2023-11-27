package edu.cit;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] n = { 3, 4, 5, 4 };
		ar(n);
	}

	public static void ar(int[] a) {
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
