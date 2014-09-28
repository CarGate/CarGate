/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:29:15
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import java.awt.Image;

import de.thm.iem.CarGate.enums.Direction;

/**
 * @author yannicklamprecht
 *
 */
public interface ICar {
	
	public void setDirection(Direction direction);
	
	public void setSpeed(int speed);
	
	public int getSpeed();

	public void setSkin(Image skin);
	
}
