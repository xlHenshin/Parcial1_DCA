package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1500, 580);
	}
	
	public void setup() {
		
		controller= new Controller(this);
	}
	
	public void draw() {
		
		
		background(0);
		
		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(11.5f);
			controller.dog().get(i).drawData(20+(140*i));
		}
		
	}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
