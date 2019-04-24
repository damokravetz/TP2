package edu.ort.taller.ejer5;

public class Puntaje {
	private String nombreEquipo;
	private int partidosGanados;
	private int partidosEmpatados;
	private int partidosPerdidos;
	private int partidosInvictos;
	private int partidosGanados4;
	private int partidosEmpatados3;

	public Puntaje() {
		nombreEquipo = "";
		partidosGanados = 0;
		partidosEmpatados = 0;
		partidosPerdidos = 0;
		partidosInvictos = 0;
		partidosGanados4 = 0;
		partidosEmpatados3 = 0;
	}

	public Puntaje(String nombreEquipo, int partidosGanados, int partidosEmpatados, int partidosPerdidos,
			int partidosInvictos, int partidosGanados4, int partidosEmpatados3) {
		this.nombreEquipo = nombreEquipo;
		this.partidosGanados = partidosGanados;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosInvictos = partidosInvictos;
		this.partidosGanados4 = partidosGanados4;
		this.partidosEmpatados3 = partidosEmpatados3;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public int getPartidosInvictos() {
		return partidosInvictos;
	}

	public int getPartidosGanados4() {
		return partidosGanados4;
	}

	public int getPartidosEmpatados3() {
		return partidosEmpatados3;
	}

	public void addPartidosGanados(int a) {
		partidosGanados += a;
	}

	public void addpartidosEmpatados(int a) {
		partidosEmpatados += a;
	}

	public void addpartidosPerdidos(int a) {
		partidosPerdidos += a;
	}

	public void addpartidosInvictos(int a) {
		partidosInvictos += a;
	}

	public void addPartidosGanados4(int a) {
		partidosGanados4 += a;
	}

	public void addpartidosEmpatados3(int a) {
		partidosEmpatados3 += a;
	}

	public void addPartidosGanados() {
		partidosGanados++;
	}

	public void addpartidosEmpatados() {
		partidosEmpatados++;
	}

	public void addpartidosPerdidos() {
		partidosPerdidos++;
	}

	public void addpartidosInvictos() {
		partidosInvictos++;
	}

	public void addPartidosGanados4() {
		partidosGanados4++;
	}

	public void addpartidosEmpatados3() {
		partidosEmpatados3++;
	}

}
