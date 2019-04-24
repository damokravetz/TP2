package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Futbol8 extends Torneo {

	public Futbol8() {
		super(8);
	}

	void mostrarPuntos() {
		ArrayList<Puntaje> misPuntajes = devolverPuntaje();
		System.out
				.println("Torneo de futbol 8 \n" + "Tabla de Posiciones al cabo de " + getCantJornadas() + " fechas: ");
		for (int i = 0; i < misPuntajes.size(); i++) {
			Puntaje puntaje = misPuntajes.get(i);
			double puntos = 0;
			puntos += puntaje.getPartidosEmpatados();
			puntos += puntaje.getPartidosEmpatados3();
			puntos += (puntaje.getPartidosGanados() * 3);
			puntos += (puntaje.getPartidosGanados4() * 0);
			puntos += puntaje.getPartidosInvictos();
			puntos += puntaje.getPartidosPerdidos();
			System.out.println(puntaje.getNombreEquipo() + ": " + puntos);
		}

	}

}
