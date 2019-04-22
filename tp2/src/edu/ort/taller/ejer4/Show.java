package edu.ort.taller.ejer4;

public class Show {
	public static void hacerTruco(String nombreanimal, int truco, MundoMarino m) {
		double comida;
		Animal animal=m.buscarAnimalPorNombre(nombreanimal);
		Entrenador entrenador=m.getEntrenador();
		comida=entrenador.getCantidadComida(animal, truco);
		Cuidador cuidador=m.buscarCuidadorPorAnimal(animal);
		if(cuidador.hayComida(comida, entrenador.getTipoComida(animal))==true) {
			switch(truco){
			case 1:
				animal.truco1();
				break;
			case 2:
				animal.truco2();
				break;
			case 3:
				animal.truco3();
				break;
			}
			
		}else {
			System.out.println("No hay comida");
		}
		
		
	}

	public static void main(String[] args) {
		MundoMarino mundo=new MundoMarino();
		Delfin delfin=new Delfin("willy",70, 2.5);
		Cuidador cuidador=new Cuidador("Pablo", 1430,1930,8);
		cuidador.rellenarStock();
		Entrenador entrenador=new Entrenador("Juan",1400, 1600,5);
		mundo.agregarPersona(cuidador);
		mundo.agregarPersona(entrenador);
		mundo.agregarAnimal(delfin);
		
		
		System.out.println("Stock inicial:");
		mundo.buscarCuidadorPorAnimal(mundo.buscarAnimalPorNombre("willy")).informarStock();
		hacerTruco("willy",1,mundo);
		System.out.println("Stock final:");
		mundo.buscarCuidadorPorAnimal(mundo.buscarAnimalPorNombre("willy")).informarStock();
	}

}
