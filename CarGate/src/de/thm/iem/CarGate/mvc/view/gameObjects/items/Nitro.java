/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 13:40:37
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.items;

import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.ICollectable;
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
public class Nitro extends GameObject implements ICollectable {

    private IEffectable nitroEffect;


	/**
	 * @param location
	 * @param gameObjects
	 */
    public Nitro(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, gameObjects);
        this.setImage(ImageIO.read(getClass().getClassLoader().getResource("de/thm/iem/CarGate/resources/view/gameObjects/items/Nitro.png")));

    }


    public void addEffect(IEffectable effect) {
        this.nitroEffect = effect;
    }

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.ICollectable#onCollect(de.thm.iem.CarGate.interfaces.ICar)
	 */
	@Override
	public void onCollect(ICar car) {
		this.setVisible(false);
        nitroEffect.playEffect(car);
    }


}
