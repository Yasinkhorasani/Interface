package de.metropolis.lebewesen;

/**
 * Beschreibe was alle vogel tun können
 * 
 * alle haben Feder / alle können ihre feer putzen/
 * 
 * 	Vogel piepmatz	= new Vogel();  _____ federutzen,toString,hashCode,equls,getClass
 * Object objflattermann = new vogel(); _____toString,hashCode,equls,getClass
 * 
 * casting : 
 * Vogel gecastet = (Vogel)objFlattermann
 * 
 * @author Alfa
 *
 */

public class Vogel {
	
	/**
	 * Federkleid wird geglätet, gefettet.....
	 */
	public void federPutzen() {
		System.out.println("das Federkleid wurde in ordnung gebracht");
	}
}
