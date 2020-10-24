package model;

import java.util.Comparator;

public class SortDate implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
	
		return o1.getNacimiento().compareTo(o2.getNacimiento());
	}

}
