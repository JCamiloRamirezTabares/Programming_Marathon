package ui;

import model.Marathon;

public class Main {

	private static Marathon m;
	
	public static void main(String [] juank) {
		m = new Marathon();
		
		m.addProgrammer("Juan Camilo Ramirez Tabares");
		m.addProgrammer("Samuel Ramirez Tabares");
		m.addProgrammer("Jesus David Rodriguez Burbano");
		m.addProgrammer("Pulguita");
		m.addProgrammer("Juan Felipe Castillo Gomez");
		m.addProgrammer("Andrea Jaramillo Parra");
		m.addProgrammer("Maria Jose Quintana Urrego");
		m.addProgrammer("Betty Infante Ponce");
		
		System.out.println("Programmers List:\n" + m.print());
		System.out.println("Binary Tree Height: " + m.getHeight());
	}
	
}
