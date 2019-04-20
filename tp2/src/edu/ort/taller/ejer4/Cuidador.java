package edu.ort.taller.ejer4;

import java.util.ArrayList;

public class Cuidador extends Persona{
private int cantAnimales;
private ArrayList<Animal>animales;
double pulpo;
double cangrejo;
double calamar;

public Cuidador(String nombre, int horaIngreso, int horaEgreso, int cantAnimales) {
	super(nombre, horaIngreso, horaEgreso);
	this.cantAnimales = cantAnimales;
	animales=new ArrayList<Animal>();
	pulpo=0;
	cangrejo=0;
	calamar=0;

}

public int getCantAnimales() {
	return cantAnimales;
}

public void setCantAnimales(int cantAnimales) {
	this.cantAnimales = cantAnimales;
}

public boolean agregarAnimal(Animal animal) {
	boolean a;
	if(animales.size()<cantAnimales) {
		animales.add(animal);
		a=true;
	}else {
		a=false;
	}
	return a;
}
public boolean hayComida(double comida, String tipo) {
	boolean res=false;
	switch(tipo) {
	case "pulpo":
		if(comida<=pulpo) {
			pulpo=pulpo-comida;
			res=true;
		}
		break;
	case "calamar":
		if(comida<=calamar) {
			calamar=calamar-comida;
			res=true;
		}
		break;
	case "cangrejo":
		if(comida<=cangrejo) {
			cangrejo=cangrejo-comida;
			res=true;
		}
		break;
	}
	return res;
}
public void rellenarStock() {
	pulpo=30;
	cangrejo=25;
	calamar=50;
	System.out.println("Stock rellenado");
}
public Animal buscarAnimal(Animal animal) {
	Animal miAnimal=null;
	int i=0;
	while(i<animales.size()&&miAnimal==null) {
		if(animales.get(i).getClass().getSimpleName().equals(animal.getClass().getSimpleName())&&animales.get(i).getNombre().equals(animal.getNombre())) {
			miAnimal=animales.get(i);
		}
	}
	return miAnimal;
}
public void informarStock() {
	System.out.println("Calamar: "+calamar+" kg\n"
			+ "Pulpo: "+pulpo+" kg\n"
					+ "Cangrejos: "+cangrejo+" kg");
}


}
