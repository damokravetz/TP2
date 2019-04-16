package edu.ort.taller.ejer3;

public class Electrodomestico {
	 private String marca;
	 private String modelo;
	 private int serie;
	 private float voltaje;
	 private boolean estado;
	 private float precio;
	
	public Electrodomestico(String marca, String modelo, int serie, float voltaje, boolean estado, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.serie = serie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public float getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[marca=" + marca + ", modelo=" + modelo + ", serie=" + serie + ", voltaje=" + voltaje
				+ ", estado=" + estado + ", precio=" + precio + "]";
	}
	
	 
}
