package edu.ort.taller.ejer3;

public class Televisor extends Electrodomestico{
	private int dimension;
	private boolean smart;
	public Televisor(String marca, String modelo, int serie, float voltaje, boolean estado, float precio, int dimension,
			boolean smart) {
		super(marca, modelo, serie, voltaje, estado, precio);
		this.dimension = dimension;
		this.smart = smart;
	}
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	@Override
	public String toString() {
		return super.toString()+"[dimension=" + dimension + ", smart=" + smart + "]";
	}
	
	
}
