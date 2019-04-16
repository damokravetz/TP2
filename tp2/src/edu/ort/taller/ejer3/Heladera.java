package edu.ort.taller.ejer3;

public class Heladera extends Electrodomestico{
private float capacidad;
private boolean nofrost;

public Heladera(String marca, String modelo, int serie, float voltaje, boolean estado, float precio, float capacidad,
		boolean nofrost) {
	super(marca, modelo, serie, voltaje, estado, precio);
	this.capacidad = capacidad;
	this.nofrost = nofrost;
}
public float getCapacidad() {
	return capacidad;
}
public void setCapacidad(float capacidad) {
	this.capacidad = capacidad;
}
public boolean isNofrost() {
	return nofrost;
}
public void setNofrost(boolean nofrost) {
	this.nofrost = nofrost;
}
@Override
public String toString() {
	return super.toString()+"[capacidad=" + capacidad + ", nofrost=" + nofrost + "]";
}


}
