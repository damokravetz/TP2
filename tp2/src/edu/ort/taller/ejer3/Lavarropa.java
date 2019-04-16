package edu.ort.taller.ejer3;

public class Lavarropa extends Electrodomestico{
private float cargamax;
private boolean automatico;
public Lavarropa(String marca, String modelo, int serie, float voltaje, boolean estado, float precio, float cargamax,
		boolean automatico) {
	super(marca, modelo, serie, voltaje, estado, precio);
	this.cargamax = cargamax;
	this.automatico = automatico;
}
public float getCargamax() {
	return cargamax;
}
public void setCargamax(float cargamax) {
	this.cargamax = cargamax;
}
public boolean isAutomatico() {
	return automatico;
}
public void setAutomatico(boolean automatico) {
	this.automatico = automatico;
}
@Override
public String toString() {
	return super.toString()+"[cargamax=" + cargamax + ", automatico=" + automatico + "]";
}

}
