package edu.ort.taller.ejer4;

public class Delfin extends Animal{
	

	public Delfin(String nombre, double peso, double tama�o) {
		super(nombre, peso, tama�o);
		// TODO Auto-generated constructor stub
	}

	public void truco1(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realiz� �truco 1�, recibi� "+pulpo+" kg de pulpo");
	}
	public void truco2(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realiz� �truco 2�, recibi� "+pulpo+" kg de pulpo");
	}
	public void truco3(double pulpo) {
		System.out.println("Delfin "+super.getNombre()+", realiz� �truco 3�, recibi� "+pulpo+" kg de pulpo");
	}
}
