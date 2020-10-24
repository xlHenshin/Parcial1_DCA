package model;

import processing.core.PApplet;

public class Dog implements Comparable<Dog> {

	private PApplet app;
	
	private int id, edad;
	private String nombre, raza, nacimiento;
	
	public Dog(int id, String nombre, int edad, String raza, String nacimiento, PApplet app) {
		
		this.app=app;
		this.id=id;
		this.nombre=nombre;
		this.edad=edad;
		this.raza=raza;
		this.nacimiento=nacimiento;
	}
	
	public void drawData(int x, int y) {
		
		app.text("Id:" + id, x, y);
		app.text("Nombre:" + nombre, x, y + 20);
		app.text("Edad:" + edad, x, y + 40);
		app.text("Raza:" + raza, x, y + 60);
		app.text("F.Nacimiento:" + nacimiento, x, y + 80);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public int compareTo(Dog nextDog) {
		// TODO Auto-generated method stub
		return this.id-nextDog.getId();
	}
	
	
	
}
