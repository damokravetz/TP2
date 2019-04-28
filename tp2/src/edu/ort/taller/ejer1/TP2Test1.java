package edu.ort.taller.ejer1;

import edu.ort.taller.ejer2.Vendedor;

public class TP2Test1 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Asalariado mAsalariado = new Asalariado("Jose", 30, 1000);
		SubContratado mSubContratado = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(mAsalariado.getClass().getSimpleName() + " " + mAsalariado.getNombre() 
		+ " gana:" + mAsalariado.calcularPago());
		System.out.println(mSubContratado.getClass().getSimpleName() + " " + mSubContratado.getNombre() 
		+ " gana:" + mSubContratado.calcularPago());
		
		
	}
}
