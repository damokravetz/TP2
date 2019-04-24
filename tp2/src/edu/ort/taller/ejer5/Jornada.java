package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Jornada {
	private ArrayList<Partido> partidos;

	public Jornada() {
		super();
		partidos = new ArrayList<Partido>();
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	
	public void AgregarPartido(Partido partido) {
		partidos.add(partido);
		System.out.println("Partido agregado a jornada");
	}

}
