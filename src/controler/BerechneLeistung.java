package controler;

import model.Fahrzeug;

public class BerechneLeistung {
	
	final static double faktor = 0.735499;
	
	public static double psInKw(double ps) {
		return ps * faktor;
		
	}

	public static double lstgInKW(Fahrzeug fahrzeug) {
		return fahrzeug.getPs() * faktor;
 	}
	
}
