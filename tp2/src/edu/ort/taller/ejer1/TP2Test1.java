package edu.ort.taller.ejer1;

public class TP2Test1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Asalariado mAsalariado = new Asalariado("Jose", 30, 1000);
		SubContratado mSubContratado = new SubContratado("Carlos", 23, 50, 100);
		Vendedor mVendedor1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor mVendedor2 = new Vendedor("Maria", 30, 100, 200, 10);
		
		System.out.println(mAsalariado.getClass().getSimpleName() + " " + mAsalariado.getNombre() 
		+ " gana:" + mAsalariado.calcularPago());
		System.out.println(mSubContratado.getClass().getSimpleName() + " " + mSubContratado.getNombre() 
		+ " gana:" + mSubContratado.calcularPago());
		System.out.println(mVendedor1.getClass().getSimpleName() + " " + mVendedor1.getNombre() 
		+ " gana:" + mVendedor1.calcularPago());
		System.out.println(mVendedor2.getClass().getSimpleName() + " " + mVendedor2.getNombre() 
		+ " gana:" + mVendedor2.calcularPago());
		
	}
}
