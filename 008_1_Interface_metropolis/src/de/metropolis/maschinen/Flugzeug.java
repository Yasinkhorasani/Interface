package de.metropolis.maschinen;

/**
 * der kann starten fliegen und landen
 */
import de.metropolis.flughafen.Flieger;
import de.metropolis.flughafen.Schwimmer;

public class Flugzeug  extends Maschine implements Flieger, Schwimmer{

	public void starten() {
		gewartetwerden();
		System.out.println("ohren zu");
	}
	
	public void fliegen() {
		System.out.println(" Über den Wolken");
		}
	
	public void landen() {
		System.out.println(" Ohren zu , aus dem Weg");
		gewartetwerden();
	}

	@Override
	public void fliehen() {
		System.out.println(" Wir Sind immernoch daa!!!");		
	}

	@Override
	public void bewegen() {
		System.out.println(" Etwas muss sich bewegen");
		
	}
}
