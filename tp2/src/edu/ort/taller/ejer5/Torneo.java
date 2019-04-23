package edu.ort.taller.ejer5;

import java.util.ArrayList;

public abstract class Torneo {
private ArrayList<Jornada>jornadas;
private int cantMaxJugadores;
public Torneo(int cantMaxJugadores) {
	super();
	this.cantMaxJugadores = cantMaxJugadores;
	jornadas=new ArrayList<Jornada>();
}

}
