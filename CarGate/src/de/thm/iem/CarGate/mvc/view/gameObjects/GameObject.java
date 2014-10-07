/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:37:26
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects;

import de.thm.iem.CarGate.interfaces.IEffectable;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

/**
 * @author yannicklamprecht
 */
@SuppressWarnings("serial")
public abstract class GameObject extends JPanel {

    protected BufferedImage skin;
    protected Vector<GameObject> gameObjects;

    protected IEffectable effectable;


    /**
     * When an Object is created is needs an location where it would be. An
     * Image for look alike. An IVector of gameobjects to react with more
     * performance
     *
     * @param bounds      the location and expansion of the drawn object
     * @param skin        the BufferedImage
     * @param suffix      a optional suffix e.g. _closed  for doors
     * @param gameObjects the IVector of gameObjects
     */
    public GameObject(Point bounds, Vector<GameObject> gameObjects) {
        this.setLocation(new Point(bounds.x - (this.getBounds().height / 2), bounds.y - this.getBounds().height / 2));
        this.gameObjects = gameObjects;
        this.gameObjects.add(this);
        this.setVisible(true);

    }

    public GameObject(Point bounds, Vector<GameObject> gameObjects, IEffectable effectable) {
        this(bounds, gameObjects);
        this.setEffectable(effectable);
    }

    public static void repaint(Vector<GameObject> gameObjects) {
        for (GameObject ob : (Vector<GameObject>) gameObjects.clone()) {
            ob.repaint();
            System.out.println(ob.getX() + " " + ob.getY());
        }
    }

    public void setImage(BufferedImage skin) {
        this.skin = skin;
    }

    public void setSkin(BufferedImage skin) {
        this.skin = skin;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawImage(skin, 0, 0, null);

    }

    public void setEffectable(IEffectable effectable) {
        this.effectable = effectable;
        this.effectable.setGameObject(this);
    }

    public void repaintAll() {
        for (GameObject ob : gameObjects) {
            ob.repaint();
        }
    }

    public IEffectable getIEffectable() {
        return effectable;
    }
}
