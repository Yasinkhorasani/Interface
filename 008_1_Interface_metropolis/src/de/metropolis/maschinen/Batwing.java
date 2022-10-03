package de.metropolis.maschinen;

import de.metropolis.flughafen.Flieger;
import de.metropolis.lebewesen.Superman;

/**
 * 
 * der ist ein maschine  um schnell zu orten fliegen, die gerettet werden müssen
 * 
 * Flieger batbat = new Battwing();
 * batBat.fliegen();
 * 
 * implements: Allle abstrakte Methoden müssen überschrieben werden
 * @author Alfa
 *
 */
public class Batwing  extends Maschine implements Flieger{
	
	private int supermansrettungen;//
	private Superman ausserirdischer;//
	
	public Batwing( Superman ausserirdischer) {//
		this.ausserirdischer = ausserirdischer;
	}
	public Batwing() {}//Patt
	
	@Override
	public void starten() {
		gewartetwerden();
		System.out.println("Hier kommt ein Mensch um welt zu retten...");
	}
	
	@Override
	public void fliegen() {
		System.out.println("zischhhhhhhhhhhhhhhhhhhh");
	}
	
	@Override
	public void landen() {
	//	int anzahlssupermansRettungen = ausserirdischer.getAnzahlDerWeltrettung();
		int anzahlssupermansRettungen = Superman.getInstance().getAnzahlDerWeltrettung();//Patt
		System.out.println("zSupermann hat der welt 5 mal geretet yetz bin ich dran");
		gewartetwerden();
	}
}
