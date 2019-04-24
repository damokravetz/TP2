package edu.ort.taller.ejer5;

public class Test {

	public static void main(String[] args) {
		OrganizacionTorneo ot=new OrganizacionTorneo();
		Futbol5 torneo=new Futbol5();
		Equipo equipo=new Equipo("Boca",5);
		Equipo equipo1=new Equipo("San Lorenzo",5);
		Partido partido=new Partido(equipo.getNombre(),equipo1.getNombre(),3,2);
		Jornada jornada=new Jornada();
		jornada.AgregarPartido(partido);
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo);
		torneo.agregarJornada(jornada);
		torneo.mostrarPuntos();
		

	}

}
