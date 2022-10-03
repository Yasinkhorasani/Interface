package de.metropolis.flughafen;

import de.metropolis.lebewesen.Spatz;
import de.metropolis.lebewesen.Superman;
import de.metropolis.maschinen.Flugzeug;

/**
 * Der tower überwacht flughafen von Metropolis
 *
 * Entsprechender Prufung machen eir anderMal, später programieren
 * 
 * Nach entschprechender Prufung wird landeerlaubniss erteilt
 * hier würde eine gemeinsame refrenz_typ ermöglichen, nur eine landeerlaubniss-methode zu haben
 * gemeinsame refrenz_typ: muss landen, starten und fliegen kennen
 * 
 * Lösung: Interface
 * @author Alfa
 *
 */
public class Tower {
	 
	public void erteilenLandelaubniss( Flieger flieger, Schwimmer schwimmer) {
		System.out.println("Die prufüng war erfolgreich");
		System.out.println(flieger.getClass().getSimpleName()+ " schön das du da bist");
		flieger.landen();
	}
//	public void erteilenLandelaubniss( Spatz flieger) {
//		System.out.println("Die prufüng war erfolgreich");
//		System.out.println(flieger.getClass().getSimpleName() + " schön das du da bist");
//		flieger.landen();
//	}
	
//	public void erteilenLandelaubniss(Flugzeug flieger) {
//		System.out.println("Die prufüng war erfolgreich");
//		System.out.println(flieger.getClass().getSimpleName() + " schön das du da bist");
//		flieger.landen();
//	}
//	
//	public void erteilenLandelaubniss(Superman flieger) {
//		System.out.println("Die prufüng war erfolgreich");
//		System.out.println(flieger.getClass().getSimpleName() + " schön das du da bist");
//		flieger.landen();
//	}
	

	public void erteilenLandelaubniss(Object flieger) {
		System.out.println("Die prufüng war erfolgreich");
		System.out.println(flieger.getClass().getSimpleName() + " schön das du da bist");
	//	flieger.landen();
	
}
}