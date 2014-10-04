/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:18:00
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * @author yannicklamprecht
 *
 */
public interface IEffectable extends ISetGameObject {

    /**
     * can play effect on car
	 * @param car
	 */
	public void playEffect(ICar car);


    /**
     * Will set the GameObject
     *
     * @param gameObject
     */
    public void setGameObject(GameObject gameObject);
}
