/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 15:10:27
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

import de.thm.iem.CarGate.interfaces.ICloseable;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Gate extends GameObject implements ICloseable {

	private Image skinClosed;
	private Image skinOpened;

	/**
	 * @param location
	 * @param skin
	 * @param gameObjects
	 */
	public Gate(Point location, Vector<GameObject> gameObjects) {
		super(location, Gate.class.getName(), "_closed", gameObjects);
		try {
			
			//this.skinClosed = ImageIO.read(new File("./de/thm/iem/CarGate/resourses/view/Gate_closed.png"));
			this.skinClosed = ImageIO.read(new File("./de/thm/iem/CarGate/resourses/view/Gate_opened.png"));
			
			//this.skinClosed = ImageIO.read(Gate.class.getResourceAsStream(new Pathreplacer(Gate.class.getName()).replace("_closed")));
			//this.skinOpened = ImageIO.read(Gate.class.getResourceAsStream(new Pathreplacer(Gate.class.getName()).replace("_opened")));
		} catch (IOException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.thm.iem.CarGate.interfaces.ICloseable#setClosed(boolean)
	 */
	@Override
	public void setClosed(boolean isClosed) {
		super.skin = isClosed ? skinClosed : skinOpened;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.thm.iem.CarGate.interfaces.ICloseable#isClosed()
	 */
	@Override
	public boolean isClosed() {
		return this.skin.equals(this.skinClosed);
	}
}
