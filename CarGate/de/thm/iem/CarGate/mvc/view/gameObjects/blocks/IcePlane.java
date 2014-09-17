/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 14:36:28
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import java.awt.Image;
import java.awt.Point;
import java.util.Vector;

import de.thm.iem.CarGate.enums.Direction;
import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.interfaces.IPlaceable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class IcePlane extends GameObject implements IPlaceable, IEffectable{

	/**
	 * @param location
	 * @param skin
	 * @param gameObjects
	 */
	public IcePlane(Point location, Image skin, Vector<GameObject> gameObjects) {
		super(location, IcePlane.class.getName(),null, gameObjects);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.IPlaceable#place(java.awt.Point)
	 */
	@Override
	public void place(Point location) {
		this.setLocation(location);
	}

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.IEffectable#playEffect(de.thm.iem.CarGate.interfaces.ICar)
	 */
	@Override
	public void playEffect(ICar car) {
		car.setSpeed(10);
		car.setDirection(Direction.random());
	}

}
