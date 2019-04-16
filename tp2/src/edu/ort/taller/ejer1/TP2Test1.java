package edu.ort.taller.ejer1;

public class TP2Test1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Asalariado mAsalariado = new Asalariado("Jose", 30, 1000);
		SubContratado mSubContratado = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(mAsalariado.getClass().getSimpleName() + " " + mAsalariado.getNombre() 
		+ " gana:" + mAsalariado.calcularPago());
		System.out.println(mSubContratado.getClass().getSimpleName() + " " + mSubContratado.getNombre() 
		+ " gana:" + mSubContratado.calcularPago());
	}
}
