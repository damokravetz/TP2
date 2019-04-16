package edu.ort.taller.ejer3;

public class Licuadora extends Electrodomestico{
private float potencia;
private int velocidades;
public Licuadora(String marca, String modelo, int serie, float voltaje, boolean estado, float precio, float potencia,
		int velocidades) {
	super(marca, modelo, serie, voltaje, estado, precio);
	this.potencia = potencia;
	this.velocidades = velocidades;
}
public float getPotencia() {
	return potencia;
}
public void setPotencia(float potencia) {
	this.potencia = potencia;
}
public int getVelocidades() {
	return velocidades;
}
public void setVelocidades(int velocidades) {
	this.velocidades = velocidades;
}
@Override
public String toString() {
	return super.toString()+"[potencia=" + potencia + ", velocidades=" + velocidades + "]";
}

}
