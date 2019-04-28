package edu.ort.taller.ejer4;

public abstract class Animal {
private String nombre;
private double peso;
private double tamanio;
public Animal(String nombre, double peso, double tamanio) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.tamanio = tamanio;
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
	return tamanio;
}
public void setTama�o(double tama�o) {
	this.tamanio = tama�o;
}
@Override
public String toString() {
	return "Animal [nombre=" + nombre + ", peso=" + peso + ", tama�o=" + tamanio + "]";
}
public void truco1(){}
public void truco2(){}
public void truco3(){}


}
