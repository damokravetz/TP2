package edu.ort.taller.ejer4;

public class Orca extends Animal{

	public Orca(String nombre, double peso, double tamanio) {
		super(nombre, peso, tamanio);
		// TODO Auto-generated constructor stub
	}
	public void truco1(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realiz� �truco 1�, recibi� "+calamar+" kg de calamares");
	}
	public void truco2(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realiz� �truco 2�, recibi� "+calamar+" kg de calamares");
	}
	public void truco3(double calamar) {
		System.out.println("Orca "+super.getNombre()+", realiz� �truco 3�, recibi� "+calamar+" kg de calamares");
	}
}
