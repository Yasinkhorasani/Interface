package de.metropolis.lebewesen;

import de.metropolis.flughafen.Flieger;

/**
 * Der weltretter Suppermaann, der kann fliegen
 * 
 * Eigentlich kann es nur einen geben...
 * Standard problem einer objectorientierung: nur EIN Object aus einer Klasse darf erstellt werden:
 * Singleton-Problem: Löung : Singleton Disign Pattern
 * @author Alfa
 *
 */
public class Superman implements Flieger{

	private int anzahlDerWeltrettung = 1;
	
	// diseign pattern
	private static Superman superman;
	
	private Superman() {}
	
	public static Superman getInstance() {
		if(superman == null) {
			superman = new Superman();
		}
		return superman;
	}
	//***************
	public void starten() {
		System.out.println("schnell umiehen und auf! die welt müss gerettet werden");
	}
	
	public void fliegen() {
		System.out.println("keien fliegt svhneller");
		//... um die welt zu reten...
	}
	
	public void landen() {
		anzahlDerWeltrettung++;
		System.out.println("ich bin hie , die welt ist zum" + anzahlDerWeltrettung +"ten Mal geretet");
	}
	
	public int getAnzahlDerWeltrettung() {
		return anzahlDerWeltrettung;
	}
}
