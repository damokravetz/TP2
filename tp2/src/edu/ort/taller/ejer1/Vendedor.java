package edu.ort.taller.ejer1;

public class Vendedor extends SubContratado {
	float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	public Vendedor() {
		porcentaje = 0;
	}

	@Override
	public float calcularPago() {
		return (super.calcularPago() + (super.calcularPago() * this.porcentaje) / 100);
	}
}
