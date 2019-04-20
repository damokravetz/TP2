package edu.ort.taller.ejer4;

public abstract class Animal {
private String nombre;
private double peso;
private double tamaño;
public Animal(String nombre, double peso, double tamaño) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.tamaño = tamaño;
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
public double getTamaño() {
	return tamaño;
}
public void setTamaño(double tamaño) {
	this.tamaño = tamaño;
}
@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", peso=" + peso + ", tamaño=" + tamaño + "]";
}

}
