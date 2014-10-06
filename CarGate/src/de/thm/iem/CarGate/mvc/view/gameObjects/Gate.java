/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 15:10:27
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects;

import de.thm.iem.CarGate.interfaces.ICloseable;
import de.thm.iem.CarGate.lib.Pathreplacer;
import de.thm.iem.CarGate.mvc.controller.gameobjectController.abbilities.Close;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Gate extends GameObject {

    private ICloseable closeable;

	/**
	 * @param location
	 * @param gameObjects
	 */
	public Gate(Point location, Vector<GameObject> gameObjects) {
		super(location, Gate.class.getName(), "_closed", gameObjects);
        try {
            this.closeable = new Close(ImageIO.read(Gate.class.getResourceAsStream(new Pathreplacer(Gate.class.getName()).replace("_closed"))), ImageIO.read(Gate.class.getResourceAsStream(new Pathreplacer(Gate.class.getName()).replace("_opened"))));
            //new Close(ImageIO.read(new File("de/thm/iem/CarGate/resourses/view/Gate_closed.png")), ImageIO.read(new File("de/thm/iem/CarGate/resourses/view/Gate_opened.png")));


        } catch (IOException e) {
        }

    }
}
