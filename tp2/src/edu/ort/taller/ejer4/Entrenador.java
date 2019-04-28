package edu.ort.taller.ejer4;

public class Entrenador extends Persona{
private int aniosXP;

public Entrenador(String nombre, int horaIngreso, int horaEgreso, int aniosXP) {
	super(nombre, horaIngreso, horaEgreso);
	this.aniosXP = aniosXP;
}

public int getAniosXP() {
	return aniosXP;
}

public void setAñosXP(int aniosXP) {
	this.aniosXP = aniosXP;
}

public String getTipoComida(Animal animal) {
	String res="";
	if(animal instanceof Delfin) {
		res= "pulpo";
	}
	if(animal instanceof Orca) {
		res= "calamar";
	}
	if(animal instanceof LoboMarino) {
		res= "cangrejo";
	}
	return res;
}
public double getCantidadComida(Animal animal, int truco) {
	double cant=0;
	switch(animal.getClass().getSimpleName()) {
	case "Delfin":
		switch(truco) {
		case 1: cant=6;
		break;
		case 2: cant=4;
		break;
		case 3: cant=5;
		break;
		}
		break;
	case "Orca":
		switch(truco) {
		case 1: cant=12;
		break;
		case 2: cant=8;
		break;
		case 3: cant=10;
		break;
		}
		break;
	case "LoboMarino":
		switch(truco) {
		case 1: cant=11;
		break;
		case 2: cant=9;
		break;
		case 3: cant=13;
		break;
		}
		break;
	}
	return cant;
}
}
