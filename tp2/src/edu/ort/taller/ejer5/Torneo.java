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

	public void agregarPartidoYJornada(Partido partido) {
		if (verificarPartido(partido) == true) {
			Jornada jornada = new Jornada();
			jornada.getPartidos().add(partido);
			jornadas.add(jornada);
			System.out.println("Partido a�adido dentro de una nueva jornada.");
		} else {
			System.out.println("Partido no a�adido. El partido " + partido.getEquipoLocal() + " vs "
					+ partido.getEquipoVisitante() + " contiene equipos no enlistados en el torneo.");
		}

	}

	private boolean verificarPartido(Partido partido) {
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

	public void agregarPartidoJornada(Partido partido, int fecha) {
		if (verificarPartido(partido) == true && fecha - 1 < jornadas.size() && fecha - 1 >= 0) {
			jornadas.get(fecha - 1).getPartidos().add(partido);
		} else {
			if (verificarPartido(partido) == false) {
				System.out.println("Partido no a�adido. El partido " + partido.getEquipoLocal() + " vs "
						+ partido.getEquipoVisitante() + " contiene equipos no enlistados en el torneo.");
			}
			if (fecha - 1 >= jornadas.size() || fecha - 1 < 0) {
				System.out.println("Partido no a�adido, fecha invalida.");
			}
		}
	}

	public void agregarJornada(Jornada jornada) {
		if (verificarJornada(jornada) == true) {
			jornadas.add(jornada);
			System.out.println("Jornada a�adida exitosamente.");
		} else {
			System.out.println("No se ha a�adido la jornada.");
		}
	}

	private boolean verificarJornada(Jornada jornada) {
		boolean salida = true;
		ArrayList<Partido> misPartidos = jornada.getPartidos();
		for (int i = 0; i < misPartidos.size(); i++) {
			boolean res = verificarPartido(misPartidos.get(i));
			if (res == false) {
				System.out.println("El partido " + misPartidos.get(i).getEquipoLocal() + " vs "
						+ misPartidos.get(i).getEquipoVisitante() + " contiene equipos no enlistados en el torneo.");
				salida = false;
			}
		}
		return salida;
	}

	public void agregarEquipo(Equipo equipo) {
		if (equipo.getJugadores() <= cantMaxJugadores) {
			equipos.add(equipo);
		} else {
			System.out.println("Este equipo supera la cantidad de jugadores permitidos.");
		}
	}
	
	void mostrarPuntos() {
		
	}
	
	private ArrayList <Partido> devolverPartidosXEquipo(int fecha, Equipo equipo) {
		ArrayList <Partido> misPartidos=new ArrayList<Partido>();
		for(int i=0;i<jornadas.get(fecha).getPartidos().size();i++) {
			if(jornadas.get(fecha).getPartidos().get(i).getEquipoLocal().equals(equipo.getNombre())||jornadas.get(fecha).getPartidos().get(i).getEquipoVisitante().equals(equipo.getNombre())) {
				misPartidos.add(jornadas.get(fecha).getPartidos().get(i));
			}
		}
		return misPartidos;
	}
	
	private Puntaje devolverPuntajeXEquipo(int fecha,Equipo equipo){
		Puntaje puntaje=new Puntaje();
		puntaje.setNombreEquipo(equipo.getNombre());
		ArrayList <Partido>misPartidos=devolverPartidosXEquipo(fecha,equipo);
		for(int i=0;i<misPartidos.size();i++) {
			Partido miPartido=misPartidos.get(i);
			if(miPartido.getEquipoLocal().equals(equipo.getNombre())/*Soy local?*/) {
				if(miPartido.getGolesLocal()>miPartido.getGolesVisitante()) {
					puntaje.addPartidosGanados();
					if(miPartido.getGolesVisitante()==0) {
						puntaje.addpartidosInvictos();
					}
					if((miPartido.getGolesLocal()-4)>miPartido.getGolesVisitante()) {
						puntaje.addPartidosGanados4();
					}
				}
				if(miPartido.getGolesLocal()<miPartido.getGolesVisitante()) {
					puntaje.addpartidosPerdidos();
				}
				if(miPartido.getGolesLocal()==miPartido.getGolesVisitante()) {
					puntaje.addpartidosEmpatados();
					if(miPartido.getGolesLocal()>3&&miPartido.getGolesVisitante()>3) {
						puntaje.addpartidosEmpatados3();
					}
				}
			}else {
				if(miPartido.getGolesLocal()<miPartido.getGolesVisitante()) {
					puntaje.addPartidosGanados();
					if(miPartido.getGolesLocal()==0) {
						puntaje.addpartidosInvictos();
					}
					if((miPartido.getGolesVisitante()-4)>miPartido.getGolesLocal()) {
						puntaje.addPartidosGanados4();
					}
				}
				if(miPartido.getGolesLocal()>miPartido.getGolesVisitante()) {
					puntaje.addpartidosPerdidos();
				}
				if(miPartido.getGolesLocal()==miPartido.getGolesVisitante()) {
					puntaje.addpartidosEmpatados();
					if(miPartido.getGolesLocal()>3&&miPartido.getGolesVisitante()>3) {
						puntaje.addpartidosEmpatados3();
					}
				}
			}
		}
		return puntaje;
	}
	devPtjeXEquipoTodasJorn(Equipo equipo){
		Puntaje miPuntaje=new Puntaje();
		for(int i=0;i<jornadas.size();i++) {
			Puntaje puntaje=devolverPuntajeXEquipo(i, equipo);
			
		}
		
	}
	

}
