/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:17:50
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import java.awt.Point;

/**
 * @author yannicklamprecht
 *
 */
public interface IPlaceable {

	/**
	 * the location where the Object is placed on the gameField
	 * @param location
	 */
	public void place(Point location);

	
}
