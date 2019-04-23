package edu.ort.taller.ejer5;

public class Equipo {
	private String nombre;
	private int jugadores;
	public Equipo(String nombre, int jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getJugadores() {
		return jugadores;
	}
	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
}
