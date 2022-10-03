package de.metropolis.movie;

import de.metropolis.flughafen.Tower;
import de.metropolis.lebewesen.Spatz;
import de.metropolis.lebewesen.Superman;
import de.metropolis.maschinen.Batwing;
import de.metropolis.maschinen.Flugzeug;

public class MetropolisAirport {

	public static void main(String[] args) {
		System.out.println(" willkommwn");
		System.out.println("Hier ist voll, viel spass und gniieße die Show\n");
		
		Spatz jack = new Spatz();
		Flugzeug booeing = new Flugzeug();
		Superman S = Superman.getInstance();//Pattern
		Batwing batmanflieger = new Batwing(S);//S
		Tower tower = new Tower();
		
		
		System.out.println(" jack, ein " + jack.getClass().getSimpleName() + " kommt vorbei"
				+ " und möchte landen");
		
		tower.erteilenLandelaubniss(jack);
		System.out.println(" jack, ein " + booeing.getClass().getSimpleName() + " kommt vorbei"
				+ " und möchte landen");
		tower.erteilenLandelaubniss(booeing);
		System.out.println(" jack, ein " + S.getClass().getSimpleName() + " kommt vorbei"
				+ " und möchte landen");
		tower.erteilenLandelaubniss(S);
		
		System.out.println("batman in seinem "+ batmanflieger.getClass().getSimpleName() + "kommt vorbei" + " und möchte fliegen");
		
		tower.erteilenLandelaubniss(batmanflieger);
		
		System.out.println( "ruhe kehrt ein metropolis, wenn es dir gefallen hat, komm mal wieder vorbei ");
	}
	/*
	Erweiterung DIESES Projekts um ein Schwimmer-Interface(kann zb 1 Methoden, 2 Methoden) evtl mit Paramtern
	* Klasse WaPo, die Methode/n der Schwimmer aufruft
	* Soll implementiert werden von Schiff und 
	*
	* Ente: (kann auch fliegen....): Syntax herausfinden
	* Ente: ist ein Vogel, ist ein Flieger, ist ein Schwimmer
	* 
	* Interface , das Flieger, Schwimmer( mit Fahrer(neues Interface)) kombiniert:
	* Syntax herausfinden
	* Mit welchen Refenzen kann das Objekt angesprochen werden?
	* zB FlieWaTüüt
	* kreativ!
	*
	* ???? Übung: Vogel cast5 = (Vogel)flgSpatz; ?????
	*
	* Kleine Herausforderung: Anpassen der landen Methode des Batwing: Wie oft hat Superman die Welt bereits gerettet.
	* (der Superman, der schon in Metropolis gelandet ist)
	*/
}

