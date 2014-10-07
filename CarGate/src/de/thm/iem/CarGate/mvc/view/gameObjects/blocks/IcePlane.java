/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 14:36:28
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.mvc.controller.gameobjectController.effects.IceEffect;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
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
    public IcePlane(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, ImageIO.read(IcePlane.class.getResource("../resources/gameObjects/blocks/IcePlane.png")), gameObjects);
        this.setEffectable(new IceEffect(this));
    }

}
