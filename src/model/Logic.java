package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	
	private String[] textOne;
	private String[] textTwo;
	private LinkedList<Dog> dog;
	
	private String[] data1;
	private String[] data2;
	
	public Logic(PApplet app) {
		
		this.app = app;
		textOne = app.loadStrings("../data/imports/datosUno.txt");
		textTwo = app.loadStrings("../data/imports/datosDos.txt");
		dog = new LinkedList<Dog>();
		
		for (int i = 0; i < textOne.length; i++) {
			
			String line = textOne[i];
			System.out.println(line);
			
			data1 = textOne[i].split(",");
		}
		
		
		for (int i = 0; i < textTwo.length; i++) {
			
			String line2 = textTwo[i];
			System.out.println(line2);
			
			data2 = textTwo[i].split(";");
		}
		
		
		
	}

	public void sortList(char key) {
		// TODO Auto-generated method stub
		
	}

}
