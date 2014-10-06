package de.thm.iem.CarGate.interfaces;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public interface ISetGameObject {

    /**
     * Will get the GameObject
     *
     * @return gameObject the set gameObject
     */
    public GameObject getGameObject();

    /**
     * Wil set the GameObject
     *
     * @param gameObject reffrence
     */
    public void setGameObject(GameObject gameObject);
}
