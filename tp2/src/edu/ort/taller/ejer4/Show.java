package edu.ort.taller.ejer4;

public class Show {
	public static void hacerTruco(String nombreanimal, int truco, MundoMarino m) {
		double comida;
		Animal animal=m.buscarAnimalPorNombre(nombreanimal);
		Entrenador entrenador=m.getEntrenador();
		comida=entrenador.getCantidadComida(animal, truco);
		Cuidador cuidador=m.buscarCuidadorPorAnimal(animal);
		if(cuidador.hayComida(comida, entrenador.getTipoComida(animal))==true) {
			switch(animal.getClass().getSimpleName()) {
			case "Delfin":
				Delfin d=(Delfin)animal;
				switch(truco) {
				case 1:
					d.truco1(comida);
					break;
				case 2:
					d.truco2(comida);
					break;
				case 3:
					d.truco3(comida);
					break;
				}
				break;
			case "Orca":
				Orca o=(Orca)animal;
				switch(truco) {
				case 1:
					o.truco1(comida);
					break;
				case 2:
					o.truco2(comida);
					break;
				case 3:
					o.truco3(comida);
					break;
				}
				break;
			case "LoboMarino":
				LoboMarino l=(LoboMarino)animal;
				switch(truco) {
				case 1:
					l.truco1(comida);
					break;
				case 2:
					l.truco2(comida);
					break;
				case 3:
					l.truco3(comida);
					break;
				}
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
