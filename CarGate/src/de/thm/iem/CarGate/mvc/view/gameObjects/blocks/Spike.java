/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:33:15
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.interfaces.IPlaceable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;
import java.util.Vector;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Spike extends GameObject implements IPlaceable {

    private IEffectable spikeEffect;

	/**
	 * @param location
	 * @param gameObjects
	 */
	protected Spike(Point location, Vector<GameObject> gameObjects) {
		super(location, Spike.class.getName(),null, gameObjects);
	}

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.IPlaceable#place(java.awt.Point)
	 */
	@Override
	public void place(Point location) {
			this.setLocation(location);
	}

}
