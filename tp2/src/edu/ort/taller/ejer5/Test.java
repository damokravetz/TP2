package edu.ort.taller.ejer5;

public class Test {

	public static void main(String[] args) {
		OrganizacionTorneo ot=new OrganizacionTorneo();
		Futbol8 torneo=new Futbol8();
		Equipo equipo=new Equipo("Boca",8);
		torneo.agregarEquipo(equipo);
		Equipo equipo1=new Equipo("San Lorenzo",8);
		torneo.agregarEquipo(equipo1);
		Equipo equipo2=new Equipo("River",8);
		torneo.agregarEquipo(equipo2);
		Equipo equipo3=new Equipo("Velez",8);
		torneo.agregarEquipo(equipo3);
		Equipo equipo4=new Equipo("Racing",8);
		torneo.agregarEquipo(equipo4);
		Equipo equipo5=new Equipo("Independiente",8);
		torneo.agregarEquipo(equipo5);
		Partido partido=new Partido(equipo.getNombre(),equipo1.getNombre(),5,4);
		Partido partido1=new Partido(equipo2.getNombre(),equipo4.getNombre(),1,2);
		Partido partido2=new Partido(equipo3.getNombre(),equipo5.getNombre(),2,6);
		Partido partido3=new Partido(equipo.getNombre(),equipo2.getNombre(),4,3);
		Partido partido4=new Partido(equipo1.getNombre(),equipo5.getNombre(),3,0);
		Partido partido5=new Partido(equipo4.getNombre(),equipo3.getNombre(),5,1);
		Partido partido6=new Partido(equipo.getNombre(),equipo3.getNombre(),6,6);
		Partido partido7=new Partido(equipo1.getNombre(),equipo2.getNombre(),3,1);
		Partido partido8=new Partido(equipo4.getNombre(),equipo5.getNombre(),2,4);
		Partido partido9=new Partido(equipo.getNombre(),equipo4.getNombre(),0,0);
		Partido partido10=new Partido(equipo2.getNombre(),equipo5.getNombre(),1,2);
		Partido partido11=new Partido(equipo1.getNombre(),equipo3.getNombre(),4,4);
		Partido partido12=new Partido(equipo.getNombre(),equipo5.getNombre(),2,1);
		Partido partido13=new Partido(equipo2.getNombre(),equipo3.getNombre(),2,5);
		Partido partido14=new Partido(equipo1.getNombre(),equipo4.getNombre(),0,3);
		Jornada jornada=new Jornada();
		Jornada jornada1=new Jornada();
		Jornada jornada2=new Jornada();
		Jornada jornada3=new Jornada();
		Jornada jornada4=new Jornada();
		jornada.AgregarPartido(partido);
		jornada.AgregarPartido(partido1);
		jornada.AgregarPartido(partido2);
		jornada1.AgregarPartido(partido3);
		jornada1.AgregarPartido(partido4);
		jornada1.AgregarPartido(partido5);
		jornada2.AgregarPartido(partido6);
		jornada2.AgregarPartido(partido7);
		jornada2.AgregarPartido(partido8);
		jornada3.AgregarPartido(partido9);
		jornada3.AgregarPartido(partido10);
		jornada3.AgregarPartido(partido11);
		jornada4.AgregarPartido(partido12);
		jornada4.AgregarPartido(partido13);
		jornada4.AgregarPartido(partido14);
		torneo.agregarJornada(jornada);
		torneo.agregarJornada(jornada1);
		torneo.agregarJornada(jornada2);
		torneo.agregarJornada(jornada3);
		torneo.agregarJornada(jornada4);
		torneo.mostrarPuntos();
		

	}

}
