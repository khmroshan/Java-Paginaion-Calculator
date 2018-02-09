package com.ros.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageCalculator {

	private static int decrement;
	private static int increment;

	public static List<Integer> pageLimitCalculator(int page, int lastpage, int pageLimit) {

		boolean crossfire = false;
		List<Integer> in = new ArrayList<Integer>();
		decrement = (page - 1);
		increment = (page + 1);
		in.add(page);
		for (int i = 1; i < pageLimit; i++) {
			if (page != decrement || page != increment) {
				if (crossfire) {
					if (decrement > 0) {
						in.add(decrement);
						decrement--;
					} else if (increment <= lastpage) {
						in.add(increment);
						increment++;
					}
					crossfire = false;
				} else {
					if (increment <= lastpage) {
						in.add(increment);
						increment++;
					} else if (decrement > 0) {
						in.add(decrement);
						decrement--;
					}
					crossfire = true;
				}
			}

		}
		Collections.sort(in);
		return in;
	}

}
