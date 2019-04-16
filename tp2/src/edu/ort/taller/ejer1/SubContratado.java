package edu.ort.taller.ejer1;

public class SubContratado extends Empleado {
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		super();
		cantHoras = 0;
		precioHora = 0;
	}

	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "[cantHoras=" + cantHoras + ", precioHora=" + precioHora + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public float calcularPago() {
		return cantHoras*precioHora;
	}
}
