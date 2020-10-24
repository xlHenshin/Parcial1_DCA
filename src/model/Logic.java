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
	SortDate sortDate;
	
	private String[] textOne;
	private String[] textTwo;
	private LinkedList<Dog> dog;
	
	private String[] saveId, saveName, saveAge, saveRace, saveDate;
	
	public Logic(PApplet app) {
		
		this.app = app;
		textOne = app.loadStrings("../data/imports/datosUno.txt");
		textTwo = app.loadStrings("../data/imports/datosDos.txt");
		dog = new LinkedList<Dog>();
		
		sortName = new SortName();
		sortAge = new SortAge();
		sortRace = new SortRace();
		sortDate = new SortDate();
		
		saveId = new String[10];
		saveName = new String[10];
		saveAge = new String[10];
		saveRace = new String[10];
		saveDate = new String[10];
	
		for (int i = 0; i < textOne.length; i++) {
			
			String[] data1 = textOne[i].split(",");
			
			int id = Integer.parseInt(data1[0]);
			String nombre = data1[1];
			int edad = Integer.parseInt(data1[2]);

			for (int j = 0; j < textTwo.length; j++) {

				String[] data2 = textTwo[j].split(",");

				if (id == Integer.parseInt(data2[0])) {
					
					String raza = data2[1];
					String nacimiento = data2[2];
					
					//Se da el formato de fecha que se necesita para luego guardarlo en el LinkedList.
					//En la clase Dog se debe hacer lo mismo con la variable nacimiento, dandole el formato.
					//De lo contrario, la fecha aparecerá con datos que no se necesitan.
					
					Date fecha = null;
					try {
						fecha = new SimpleDateFormat("dd-MM-yyyy").parse(nacimiento);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			

					dog.add(new Dog(app, id, nombre, edad, raza, fecha));
				}
			}

		}
		
		
	}

	public void sortList(char key) {
		
		switch (key) {
		
		//Ordenamiento (natural) por ID
		case 'q':
			
			Collections.sort(dog);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				String nombre = dog.get(i).getNombre();
				String edad = Integer.toString(dog.get(i).getEdad());
				String raza = dog.get(i).getRaza();
				
				//Al igual que en el for de arriba, acá se debe hacer lo mismo con los formatos para poder tener
				//un correcto resutado a la hora de guardar el arreglo en el txt.
				
				Date fecha = dog.get(i).getNacimiento();
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fecha2 = formato.format(fecha);
				
				String line = id + "," + nombre + "," + edad + "," + raza + "," + fecha2;

				saveId[i] = line;
				
				String prueba = saveId[i];
				System.out.println(prueba);
				
				app.saveStrings("OrganizadoPorId.txt", saveId);
			}
			
			break;

		//Ordenamiento por nombre
		case 'w':
			
			Collections.sort(dog, sortName);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				String nombre = dog.get(i).getNombre();
				String edad = Integer.toString(dog.get(i).getEdad());
				String raza = dog.get(i).getRaza();
				
				Date fecha = dog.get(i).getNacimiento();
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fecha2 = formato.format(fecha);
				
				String line = id + "," + nombre + "," + edad + "," + raza + "," + fecha2;

				saveName[i] = line;
				
				String prueba = saveName[i];
				System.out.println(prueba);

				app.saveStrings("OrganizadoPorNombre.txt", saveName);
			}
			break;
			
		//Ordenamiento por edad
		case 'e':
			
			Collections.sort(dog, sortAge);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				String nombre = dog.get(i).getNombre();
				String edad = Integer.toString(dog.get(i).getEdad());
				String raza = dog.get(i).getRaza();
				
				Date fecha = dog.get(i).getNacimiento();
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fecha2 = formato.format(fecha);
				
				String line = id + "," + nombre + "," + edad + "," + raza + "," + fecha2;

				saveAge[i] = line;
				
				String prueba = saveAge[i];
				System.out.println(prueba);

				app.saveStrings("OrganizadoPorEdad.txt", saveAge);
			}
			break;
			
		//Ordenamiento por raza
		case 'r':
			
			Collections.sort(dog, sortRace);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				String nombre = dog.get(i).getNombre();
				String edad = Integer.toString(dog.get(i).getEdad());
				String raza = dog.get(i).getRaza();
				
				Date fecha = dog.get(i).getNacimiento();
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fecha2 = formato.format(fecha);
				
				String line = id + "," + nombre + "," + edad + "," + raza + "," + fecha2;

				saveRace[i] = line;
				
				String prueba = saveRace[i];
				System.out.println(prueba);

				app.saveStrings("OrganizadoPorRaza.txt", saveRace);
			}
			break;
			
		//Ordenamiento por fecha de nacimiento
		case 't':
			
			Collections.sort(dog, sortDate);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				String nombre = dog.get(i).getNombre();
				String edad = Integer.toString(dog.get(i).getEdad());
				String raza = dog.get(i).getRaza();
				
				Date fecha = dog.get(i).getNacimiento();
				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String fecha2 = formato.format(fecha);
				
				String line = id + "," + nombre + "," + edad + "," + raza + "," + fecha2;

				saveDate[i] = line;
				
				String prueba = saveDate[i];
				System.out.println(prueba);

				app.saveStrings("OrganizadoPorFechaNacimiento.txt", saveDate);
			}
			break;
		default:
			break;
		}
	}

	public LinkedList<Dog> getDog() {
		return dog;
	}

}
