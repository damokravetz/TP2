package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Futbol5 extends Torneo {

	public Futbol5() {
		super(5);
	}

	void mostrarPuntos() {
		ArrayList<Puntaje> misPuntajes = devolverPuntaje();
		System.out
				.println("Torneo de futbol 8 \n" + "Tabla de Posiciones al cabo de " + getCantJornadas() + " fechas: ");
		for (int i = 0; i < misPuntajes.size(); i++) {
			Puntaje puntaje = misPuntajes.get(i);
			double puntos = 0;
			puntos += puntaje.getPartidosEmpatados();
			puntos += (puntaje.getPartidosEmpatados3() * 2);
			puntos += (puntaje.getPartidosGanados() * 2);
			puntos += puntaje.getPartidosGanados4();
			puntos += (puntaje.getPartidosInvictos() * 0);
			puntos += (puntaje.getPartidosPerdidos() * 0);
			System.out.println(puntaje.getNombreEquipo() + ": " + puntos);
		}
	}

}
