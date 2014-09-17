/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:37:26
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import de.thm.iem.CarGate.lib.Pathreplacer;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public abstract class GameObject extends JPanel {

	protected Image skin;
	protected Vector<GameObject> gameObjects;

	/**
	 * When an Object is created is needs an location where it would be. An
	 * Image for look alike. An Vector of gameobjects to react with more
	 * performance
	 * 
	 * @param location
	 * @param skin
	 * @param gameObjects
	 */
	public GameObject(Point bounds, String path,String suffix, Vector<GameObject> gameObjects) {
		try {
			//TODO Replace before export using images as resources
			this.skin = ImageIO.read(new File(
					//getClass().getResourceAsStream(
					new Pathreplacer(path).replace(suffix)));
			this.getBounds().height = this.skin.getHeight(null);
			this.getBounds().width = this.skin.getWidth(null);
			this.setLocation(new Point(bounds.x-this.getBounds().height/2, bounds.y - this.getBounds().height/2));
		} catch (IOException e) {
		}
		this.gameObjects = gameObjects;
		this.gameObjects.add(this);
		this.setVisible(true);
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(skin, this.getX(), this.getY(), this.getBounds().width,
				this.getBounds().height, null);
	}

	public void update() {
		this.repaint();
	}

	public void updateAll() {
		for (GameObject ob : gameObjects) {
			ob.update();
		}
	}

	@SuppressWarnings("unchecked")
	public static void update(Vector<GameObject> gameObjects) {
		for (GameObject ob : (Vector<GameObject>)gameObjects.clone()) {
			ob.update();
		}
	}
}
