package edu.ort.taller.ejer4;

public abstract class Animal {
private String nombre;
private double peso;
private double tama�o;
public Animal(String nombre, double peso, double tama�o) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.tama�o = tama�o;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getTama�o() {
	return tama�o;
}
public void setTama�o(double tama�o) {
	this.tama�o = tama�o;
}
@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", peso=" + peso + ", tama�o=" + tama�o + "]";
}

}
