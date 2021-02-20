package starter;

import controler.BerechneLeistung;
import model.Fahrzeug;
import model.PKW;

public class Fzapp {

	public static void main(String[] args) {
		// erstelle ein Array von Objekten 
		Fahrzeug[] myArr = new Fahrzeug[3];
		// erzeuge PKW Objekt auf myArr[0]
		myArr[0] = new PKW();
		// casted das PKW objekt auf myArr[0]
		PKW meinObjekt = (PKW)myArr[0]; // casting um auf die Methode getBauform zuzugreifen, die es nur bei PKW gibt
		
		myArr[0].setFahrzeugklasse("PKW");
		myArr[0].setFarbe("silber");
		myArr[0].setHersteller("VW");
		myArr[0].setPs(125);
		((PKW)myArr[0]).setBauform("LKW"); // casting um setBauform ausführen zu können
		meinObjekt.setBauform("Limousine"); // greift ebenfalls auf die Methode setBauform() zu und überschreibt den LKW
		meinObjekt.setHersteller("Porsche"); // setzt den Hersteller
		// Zugriff über myArr[0]
		System.out.printf("Fahrzeugklasse = %s %nFarbe = %s %nHersteller = %s %nLeistung =  %.0f PS %nBauform = %s .%n%n" ,myArr[0].getFahrzeugklasse(), myArr[0].getFarbe(), myArr[0].getHersteller(), myArr[0].getPs(), meinObjekt.getBauform());
		// Zugriff über meinObjekt
		System.out.printf("Fahrzeugklasse = %s %nFarbe = %s %nHersteller = %s %nLeistung =  %.0f PS %nBauform = %s . %n%n" ,meinObjekt.getFahrzeugklasse(), meinObjekt.getFarbe(), meinObjekt.getHersteller(), meinObjekt.getPs(), meinObjekt.getBauform());
		// Leistung in KW psInkw()
		double lstg = BerechneLeistung.psInKw(meinObjekt.getPs());
		System.out.printf("Dein %s hat %.0f PS. Das entspricht %.0f KW .%n%n", meinObjekt.getHersteller(), meinObjekt.getPs(), lstg);
	    //Leistung in kw LstgInKw()
		double kw = BerechneLeistung.lstgInKW(meinObjekt);
		System.out.printf("Dein %s hat %.0f PS. Das entspricht %.0f KW .%n%n", meinObjekt.getHersteller(), meinObjekt.getPs(), kw);
		System.out.printf("Dein %s hat %.0f PS. Das entspricht %.0f KW .", meinObjekt.getHersteller(), meinObjekt.getPs(), BerechneLeistung.lstgInKW(meinObjekt));
	}

}
