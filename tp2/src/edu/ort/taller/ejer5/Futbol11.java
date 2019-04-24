package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class Futbol11 extends Torneo {

	public Futbol11() {
		super(11);
	}

	void mostrarPuntos() {
		ArrayList<Puntaje> misPuntajes = devolverPuntaje();
		System.out
				.println("Torneo de futbol "+super.getCantMaxJugadores()+" \n" + "Tabla de Posiciones al cabo de " + getCantJornadas() + " fechas: ");
		for (int i = 0; i < misPuntajes.size(); i++) {
			Puntaje puntaje = misPuntajes.get(i);
			double puntos = 0;
			puntos += puntaje.getPartidosEmpatados();
			puntos += (puntaje.getPartidosEmpatados3() * 0);
			puntos += (puntaje.getPartidosGanados() * 3);
			puntos += (puntaje.getPartidosGanados4() * 0);
			puntos += (puntaje.getPartidosInvictos() * 0);
			puntos += (puntaje.getPartidosPerdidos() * 0);
			System.out.println(puntaje.getNombreEquipo() + ": " + puntos);
		}
	}

}
