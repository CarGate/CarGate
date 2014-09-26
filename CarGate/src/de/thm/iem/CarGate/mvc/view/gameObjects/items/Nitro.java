/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 13:40:37
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.items;

import java.awt.Point;
import java.util.Vector;

import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.ICollectable;
import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Nitro extends GameObject implements IEffectable, ICollectable{

	/**
	 * @param location
	 * @param skin
	 * @param gameObjects
	 */
	public Nitro(Point location,Vector<GameObject> gameObjects) {
		super(location, Nitro.class.getName(),null, gameObjects);
	}

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.ICollectable#onCollect(de.thm.iem.CarGate.interfaces.ICar)
	 */
	@Override
	public void onCollect(ICar car) {
		this.setVisible(false);
		this.playEffect(car);
	}

	/* (non-Javadoc)
	 * @see de.thm.iem.CarGate.interfaces.IEffectable#playEffect(de.thm.iem.CarGate.interfaces.ICar)
	 */
	@Override
	public void playEffect(ICar car) {
		
	new Thread(new Runnable() {
			
			@Override
			public void run() {
				car.setSpeed(15/10);
				try {
					Thread.sleep(1000* 60);
				} catch (InterruptedException e) {
				}
				car.setSpeed(2/3);
				
			}
		}).start();
		
	}

}
