package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1820, 580);
	}
	
	public void setup() {
		
		controller= new Controller(this);
	}
	
	public void draw() {
		
		
		background(0);
		
		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(12);
			controller.dog().get(i).drawData(23+(180*i),100);
		}
		
	}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
