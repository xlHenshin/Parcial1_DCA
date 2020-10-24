package model;

import java.util.Comparator;

public class SortRace implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
