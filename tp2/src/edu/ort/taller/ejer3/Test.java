package edu.ort.taller.ejer3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double total = 0;
		ArrayList<Electrodomestico> productos = new ArrayList<Electrodomestico>();
		ArrayList<Electrodomestico> misProductos = new ArrayList<Electrodomestico>();
		Heladera a = new Heladera("Whirlpool", "H2745", 123456, 220, false, 14999, 250, true);
		Televisor b = new Televisor("Phillips", "49PGFS", 123456, 220, false, 14370, 49, true);
		Lavarropa c = new Lavarropa("Drean", "CONCEPT 5.05", 123456, 220, false, 6799, 6, false);
		productos.add(a);
		productos.add(b);
		productos.add(c);
		System.out.println("Ingrese un numero de producto para agregarlo a la lista:");
		System.out.println("0: finalizar");
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(i + 1 + ": " + productos.get(i).toString());
		}
		int entrada;
		entrada = input.nextInt();
		while (entrada != 0) {
			while (entrada < 0 || entrada > productos.size()) {
				System.out.println("Numero invalido, por favor ingresar un numero del 0 al " + productos.size());
				entrada = input.nextInt();
			}
			misProductos.add(productos.get(entrada - 1));
			System.out.println("Producto añadido a la lista. Ingrese otro producto");
			entrada = input.nextInt();
		}
		System.out.println("Ticket de venta:");
		for (int i = 0; i < misProductos.size(); i++) {
			total += misProductos.get(i).getPrecio();
			if (misProductos.get(i) instanceof Heladera) {
				Heladera h1 = (Heladera) misProductos.get(i);
				String nofrost = " ";
				if (h1.isNofrost()) {
					nofrost = ", No Frost, ";
				}
				System.out.println("Heladera " + h1.getMarca() + ", modelo " + h1.getModelo() + nofrost + "capacidad "
						+ h1.getCapacidad() + " litros: $" + h1.getPrecio());
			}

			if (misProductos.get(i) instanceof Lavarropa) {
				Lavarropa l1 = (Lavarropa) misProductos.get(i);
				String sa = " Semi Automatico, ";
				if (l1.isAutomatico()) {
					sa = " Automatico, ";
				}
				System.out.println("Lavarropa " + l1.getMarca() + sa + "carga máxima " + l1.getCargamax() + ", modelo "
						+ l1.getModelo() + ": $" + l1.getPrecio());
			}
			if (misProductos.get(i) instanceof Licuadora) {
				Licuadora l2 = (Licuadora) misProductos.get(i);
				System.out.println("Licuadora " + l2.getMarca() + " modelo " + l2.getModelo() + ", "
						+ l2.getVelocidades() + " velocidades: $" + l2.getPrecio());

			}
			if (misProductos.get(i) instanceof Televisor) {
				Televisor t1 = (Televisor) misProductos.get(i);
				String smart = " ";
				if (t1.isSmart()) {
					smart = " Smart ";
				}
				System.out.println("Televisor" + smart + t1.getMarca() + " " + t1.getDimension() + " pulgadas, modelo "
						+ t1.getModelo() + ": $" + t1.getPrecio());

			}

		}
		System.out.println("Total: $" + total);

	}

}
