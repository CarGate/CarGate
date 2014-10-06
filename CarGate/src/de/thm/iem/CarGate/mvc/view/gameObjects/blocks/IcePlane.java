/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 14:36:28
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.interfaces.IPlaceable;
import de.thm.iem.CarGate.mvc.controller.gameobject.effects.IceEffect;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;
import java.util.Vector;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class IcePlane extends GameObject{

	/**
	 * @param location
	 * @param gameObjects
	 */
    public IcePlane(Point location, Vector<GameObject> gameObjects) {
        super(location, IcePlane.class.getName(),null, gameObjects);
        this.setEffectable(new IceEffect(this));
    }

}
