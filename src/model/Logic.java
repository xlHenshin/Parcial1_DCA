package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;


import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	
	SortName sortName;
	SortAge sortAge;
	SortRace sortRace;
	
	private String[] textOne;
	private String[] textTwo;
	private LinkedList<Dog> dog;
	
	public Logic(PApplet app) {
		
		this.app = app;
		textOne = app.loadStrings("../data/imports/datosUno.txt");
		textTwo = app.loadStrings("../data/imports/datosDos.txt");
		dog = new LinkedList<Dog>();
		
		sortName = new SortName();
		sortAge = new SortAge();
		sortRace = new SortRace();
	
		for (int i = 0; i < textOne.length; i++) {

			String line = textOne[i];
			System.out.println(line);
			
			String[] data1 = textOne[i].split(",");
			
			int id = Integer.parseInt(data1[0]);
			String nombre = data1[1];
			int edad = Integer.parseInt(data1[2]);

			for (int j = 0; j < textTwo.length; j++) {

				String line2 = textTwo[i];
				System.out.println(line2);
				
				String[] data2 = textTwo[j].split(",");

				if (id == Integer.parseInt(data2[0])) {
					
					String raza = data2[1];
					String nacimiento = data2[2];

					dog.add(new Dog(id, nombre, edad, raza, nacimiento, app));
				}
			}

		}
		
		
	}

	public void sortList(char key) {
		
		switch (key) {
		case 'i':
			
			Collections.sort(dog);
			break;

		case 'n':
			
			Collections.sort(dog, sortName);
			break;
			
		case 'e':
			
			Collections.sort(dog, sortAge);
			break;
		
		case 'r':
			
			Collections.sort(dog, sortRace);
			break;
		
		case 'f':
			
			Collections.sort(dog);
			break;
		default:
			break;
		}
	}

	public LinkedList<Dog> getDog() {
		return dog;
	}

}
