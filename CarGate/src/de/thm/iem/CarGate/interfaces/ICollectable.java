/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:18:15
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

/**
 * @author yannicklamprecht
 *
 */
public interface ICollectable {
	/**
	 * When a car collides with this type of object the object will be picked up.
	 * Object can apply any effects the car modifiers allow.
	 * @param car
	 */
	public void onCollect(ICar car);
	
	/**
	 * This methode set the visibility.
	 * e.g. methode will be run on collect
	 * @param isVisible
	 */
	public void setVisible(boolean isVisible);
}
