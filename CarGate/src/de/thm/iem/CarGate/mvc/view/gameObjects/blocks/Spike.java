/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:33:15
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.interfaces.IEffectable;
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
public class Spike extends GameObject{

    private IEffectable spikeEffect;

	/**
	 * @param location
	 * @param gameObjects
	 */
    public Spike(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, gameObjects);
        this.setImage(ImageIO.read(getClass().getClassLoader().getResource("de/thm/iem/CarGate/resources/view/gameObjects/blocks/Spike.png")));
    }


}
