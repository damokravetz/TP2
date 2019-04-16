package edu.ort.taller.ejer1;

public class Asalariado extends Empleado {
	private float sueldo;
	
	public Asalariado(){
		super();
		sueldo = 0;
	}
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "[sueldo=" + sueldo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularPago() {
		return sueldo;
	}
}
