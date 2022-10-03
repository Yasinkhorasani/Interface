package de.metropolis.lebewesen;

import de.metropolis.flughafen.Flieger;
import de.metropolis.flughafen.Schwimmer;

/**
 * ein spatz ist Ein Vogel
 * Ein Spatz ist ein flieger: Flieger
 * Ein Spatz ist ein Schwimmer
 * 
 * ist ein Singvogel/ der macht piep bei allem was er tut
 * der kann fliegen
 *  
 *  Spatz spatz = new Spatz()           starten,fliegen, landen federputzen, toSring,hashCode,equls,getClass
 *  Vogel vogelSpatz = new Spatz();     federputzen, toSring,hashCode,equls,getClass
 *  Object obj = new  Spatz();       	toSring,hashCode,equls,getClass
 *  Flieger spatz = new Spatz();        starten, fliegen, landen ,toSring,hashCode,equls,getClass
 *   ***  
 *  Casting :
 *  Spatz cast1 = (spatz)vglSpatz;   starten, fliegen, landen federputzen, toSring,hashCode,equls,getClass
 *  Spatz cast2 =()SpatzobjSpatz;    starten, fliegen, landen federputzen, toSring,hashCode,equls,getClass
 *  Vogel cast3 = (Vogel)objSpatz    federputzen, toSring,hashCode,equls,getClass
 *  Spatz cast4 = (Spatz)fliegerSpatz    starten, fliegen, landen federputzen, toSring,hashCode,equls,getClass
 *  
 *  ???? Übung : Vogel cast5 = ()
 * @author Alfa
 *
 */

public class Spatz extends Vogel implements Flieger, Schwimmer {
	
	public void starten() {
		federPutzen();
		System.out.println("Piep");
		// Piep: das heißt ich suche nach kirschen
	}
	
	public void fliegen() {
		System.out.println("Piep");
		//Piep: das haeißt: irgendwo sind die Kirschen
	}
	
	public void landen() {
		System.out.println("Piep");
		//Piep: heißt: lecker kirschen
		federPutzen();
	}
   /**
    * implemenetiert vvon Schwimmer
    */
	@Override
	public void fliehen() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * implemenetiert vvon Schwimmer
	 */
	@Override
	public void bewegen() {
		// TODO Auto-generated method stub
		
	}

}
