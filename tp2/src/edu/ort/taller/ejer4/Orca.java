package edu.ort.taller.ejer4;

public class Orca extends Animal{

	public Orca(String nombre, double peso, double tamanio) {
		super(nombre, peso, tamanio);
		// TODO Auto-generated constructor stub
	}
	public void truco1(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realizó “truco 1”, recibió "+calamar+" kg de calamares");
	}
	public void truco2(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realizó “truco 2”, recibió "+calamar+" kg de calamares");
	}
	public void truco3(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realizó “truco 3”, recibió "+calamar+" kg de calamares");
	}
}
