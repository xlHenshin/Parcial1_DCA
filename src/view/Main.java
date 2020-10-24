package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1880, 450);
	}
	
	public void setup() {
		
		controller= new Controller(this);
	}
	
	public void draw() {
		
		
		background(0);
		
		drawText();
		
		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(13);
			controller.dog().get(i).drawData(23+(185*i),300);
		}
		
	}
	
	public void drawText() {
		
		textSize(20);
		text("Fundación Peludos Sin Hogar", 25, 50);
		text("Para organizar la información, presione las teclas indicadas:", 25, 50+40);
		text("Q = ID", 25, 100+20);
		text("W = Nombre", 25, 100+40);
		text("E = Edad", 25, 100+60);
		text("R = Raza", 25, 100+80);
		text("T = Fecha de Nacimiento", 25, 100+100);
		
	}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
