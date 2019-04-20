package edu.ort.taller.ejer4;

public class LoboMarino extends Animal{

	public LoboMarino(String nombre, double peso, double tamaño) {
		super(nombre, peso, tamaño);
		// TODO Auto-generated constructor stub
	}
	public void truco1(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realizó “truco 1”, recibió "+cangrejo+" kg de cangrejos");
	}
	public void truco2(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realizó “truco 2”, recibió "+cangrejo+" kg de cangrejos");
	}
	public void truco3(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realizó “truco 3”, recibió "+cangrejo+" kg de cangrejos");
	}

}
