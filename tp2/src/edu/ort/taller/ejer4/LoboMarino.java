package edu.ort.taller.ejer4;

public class LoboMarino extends Animal{

	public LoboMarino(String nombre, double peso, double tama�o) {
		super(nombre, peso, tama�o);
		// TODO Auto-generated constructor stub
	}
	public void truco1(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realiz� �truco 1�, recibi� "+cangrejo+" kg de cangrejos");
	}
	public void truco2(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realiz� �truco 2�, recibi� "+cangrejo+" kg de cangrejos");
	}
	public void truco3(double cangrejo) {
		System.out.println("Lobo marino "+super.getNombre()+", realiz� �truco 3�, recibi� "+cangrejo+" kg de cangrejos");
	}

}
