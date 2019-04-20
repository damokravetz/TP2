package edu.ort.taller.ejer4;

public class Delfin extends Animal{
	

	public Delfin(String nombre, double peso, double tamaño) {
		super(nombre, peso, tamaño);
		// TODO Auto-generated constructor stub
	}

	public void truco1(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realizó “truco 1”, recibió "+pulpo+" kg de pulpo");
	}
	public void truco2(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realizó “truco 2”, recibió "+pulpo+" kg de pulpo");
	}
	public void truco3(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realizó “truco 3”, recibió "+pulpo+" kg de pulpo");
	}
}
