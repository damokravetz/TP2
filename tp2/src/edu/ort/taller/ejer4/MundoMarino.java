package edu.ort.taller.ejer4;

import java.util.ArrayList;

public class MundoMarino {
private ArrayList<Animal>animales;
private ArrayList<Persona>personas;
public MundoMarino() {
	super();
	this.animales = new ArrayList<Animal>();
	this.personas = new ArrayList<Persona>();
}
public void agregarAnimal(Animal animal) {
	int i=0;
	boolean res=false;
	while(i<personas.size()&&res==false) {
		if(personas.get(i)instanceof Cuidador) {
			Cuidador miCuidador=(Cuidador)personas.get(i);
			res=miCuidador.agregarAnimal(animal);
		}
		i++;
	}
	if(res==true) {
		System.out.println("Animal agregado correctamente");
		animales.add(animal);
	}else {
		System.out.println("Animal no agregado");
	}
}

public void agregarPersona(Persona persona) {
	personas.add(persona);
	System.out.println("Empleado agrecado correctamente");
}
Animal buscarAnimalPorNombre(String nombre){
	Animal miAnimal=null;
	int i=0;
	while(i<animales.size()&&miAnimal==null) {
		if(animales.get(i).getNombre().equals(nombre)) {
			miAnimal=animales.get(i);
		}
		i++;
	}
	return miAnimal;
}
public Cuidador buscarCuidadorPorAnimal(Animal animal){
	int i=0;
	Cuidador miCuidador=null;
	while(i<personas.size()&&miCuidador==null) {
		if(personas.get(i)instanceof Cuidador) {
			Cuidador c=(Cuidador)personas.get(i);
			if(c.buscarAnimal(animal)!=null) {
				miCuidador=c;
			}
		}
		i++;
	}
	return miCuidador;
}
public Entrenador getEntrenador() {
	Entrenador miEntrenador=null;
	int i=0;
	while(i<personas.size()) {
		if(personas.get(i)instanceof Entrenador) {
			miEntrenador=(Entrenador)personas.get(i);
		}
		i++;
	}
	return miEntrenador;
}


}
