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
	
	/**
	 * Sets the direction the car is driving
	 * @param direction
	 */
	public void setDirection(Direction direction);
	
	
	/**
	 * Sets the speed the car is driving
	 * @param speed
	 */
	public void setSpeed(int speed);
	
	/**
	 * Returns the velocity / speed of the car
	 * @return speed as int
	 */
	public int getSpeed();

	/**
	 * Sets the carskins
	 * @param skin
	 */
	public void setSkin(Image skin);
	
}
