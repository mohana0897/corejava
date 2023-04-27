package com.ssd.comparator;

import java.util.Comparator;

public class CityComperator1 implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		int a=o1.getAdd().getCity().compareTo(o2.getAdd().getCity());
		if(a==0) {
			o1.getName().compareTo(o2.getName());
		}
			
		
		return a;
	}

}
