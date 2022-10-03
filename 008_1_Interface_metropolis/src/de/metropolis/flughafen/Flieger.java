package de.metropolis.flughafen;

/**
 * 
 * erstellt Referenztypen
 * keine Objekte: erstellt niemand , der einen "job" erledigt
 * methodenhn werden nicht durchgeführt
 * 
 * Methoden sind ABSTRAKT(keine methodenKörper)
 * 
 * die Methoden in interface sind immer public, das heißt wir können es weglassen
 * @author Alfa
 *
 */
public interface Flieger {
	
	/**
	 * hier soll ein flugfähigen Object starten
	 */
	public void starten();
	
	/**
	 * .....
	 */
	void fliegen();
	/**
	 * Wird von tower aufgerufen wenn landeerlaubnis erteilt
	 */
	void landen();
}
