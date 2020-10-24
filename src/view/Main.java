package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1280, 580);
	}
	
	public void setup() {
		
		controller= new Controller(this);
	}
	
	public void draw() {
		
		
		background(0);
		
	}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
