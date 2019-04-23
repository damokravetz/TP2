package edu.ort.taller.ejer5;

import java.util.ArrayList;

public abstract class Torneo {
	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	private int cantMaxJugadores;

	public Torneo(int cantMaxJugadores) {
		super();
		this.cantMaxJugadores = cantMaxJugadores;
		jornadas = new ArrayList<Jornada>();
		equipos = new ArrayList<Equipo>();
	}
	boolean verificarPartido(Partido partido){
		int o = 0;
		boolean equipo1 = false;
		boolean equipo2 = false;
		boolean res = false;
		while (o < equipos.size() && res == false) {
			if (equipo1 == false) {
				if (partido.getEquipoLocal().equals(equipos.get(o).getNombre())) {
					equipo1 = true;
					o = 0;
				}
			} else {
				if (equipo2 == false) {
					if (partido.getEquipoVisitante().equals(equipos.get(o).getNombre())) {
						equipo2 = true;
					}
				}
			}
			o++;
			if (equipo1 == true && equipo2 == true) {
				res = true;
			}
	}
		return res;
	}
	
	void agregarPartidoJornada(Partido partido, int fecha){
		if(verificarPartido(partido)==true&& fecha<jornadas.size()&&fecha>=0) {
			jornadas.get(fecha).getPartidos().add(partido);
		}else {
			if(verificarPartido(partido)==false) {
				System.out.println("Partido no añadido. El partido " + partido.getEquipoLocal() + " vs "
						+ partido.getEquipoVisitante() + " contiene equipos no enlistados en el torneo.");
			}
			if(fecha>=jornadas.size()||fecha<0) {
				System.out.println("Partido no añadido, fecha invalida.");
			}
		}
	}

	void agregarJornada(Jornada jornada) {
		if (verificarJornada(jornada) == true) {
			jornadas.add(jornada);
			System.out.println("Jornada añadida exitosamente.");
		} else {
			System.out.println("No se ha añadido la jornada.");
		}
	}

	boolean verificarJornada(Jornada jornada) {
		boolean salida = true;
		ArrayList<Partido> misPartidos = jornada.getPartidos();
		for (int i = 0; i < misPartidos.size(); i++) {
			boolean res=verificarPartido(misPartidos.get(i));
			if (res == false) {
				System.out.println("El partido " + misPartidos.get(i).getEquipoLocal() + " vs "
						+ misPartidos.get(i).getEquipoVisitante() + " contiene equipos no enlistados en el torneo.");
				salida = false;
			}
		}
		return salida;
	}

	void agregarEquipo(Equipo equipo) {
		if (equipo.getJugadores() <= cantMaxJugadores) {
			equipos.add(equipo);
		} else {
			System.out.println("Este equipo supera la cantidad de jugadores permitidos.");
		}
	}
}
