package model;

import java.util.Comparator;

public class SortAge implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		
		return o1.getEdad()-o2.getEdad();
	}

}
