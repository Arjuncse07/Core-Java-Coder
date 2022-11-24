package com.arjun.Collections.Sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Body>{

	@Override
	public int compare(Body o1, Body o2) {
		
		return o1.getBodyName().compareTo(o2.getBodyName());
	}

}
