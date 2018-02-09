package com.ros.main;

public class Main {

	public static void main(String[] args) {
		
		
		int current_page=15; // current page
		int last_page=300;	// total no of pages
		int no_page=10;		// pagination list. no of pages.
		
		// this function will return integer list.
		System.out.println(PageCalculator.pageLimitCalculator(current_page, last_page, no_page));

	}

}
