package edu.ort.taller.ejer5;

import java.util.ArrayList;

public class OrganizacionTorneo {
private ArrayList<Torneo>torneos;

public OrganizacionTorneo() {
	super();
	torneos=new ArrayList<Torneo>();
}
void agregarTorneo(Torneo torneo){
	torneos.add(torneo);
}
}
