package edu.ort.taller.ejer4;

public abstract class Persona {
private String nombre;
private int horaIngreso;
private int horaEgreso;
public Persona(String nombre, int horaIngreso, int horaEgreso) {
	super();
	this.nombre = nombre;
	this.horaIngreso = horaIngreso;
	this.horaEgreso = horaEgreso;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getHoraIngreso() {
	return horaIngreso;
}
public void setHoraIngreso(int horaIngreso) {
	this.horaIngreso = horaIngreso;
}
public int getHoraEgreso() {
	return horaEgreso;
}
public void setHoraEgreso(int horaEgreso) {
	this.horaEgreso = horaEgreso;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", horaIngreso=" + horaIngreso + ", horaEgreso=" + horaEgreso + "]";
}

}
