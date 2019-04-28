package edu.ort.taller.ejer2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor mVendedor1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor mVendedor2 = new Vendedor("Maria", 30, 100, 200, 10);
		
		System.out.println(mVendedor1.getClass().getSimpleName() + " " + mVendedor1.getNombre() 
		+ " gana:" + mVendedor1.calcularPago());
		System.out.println(mVendedor2.getClass().getSimpleName() + " " + mVendedor2.getNombre() 
		+ " gana:" + mVendedor2.calcularPago());

	}

}
