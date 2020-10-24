package model;

import java.util.Comparator;

public class SortName implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}


}
