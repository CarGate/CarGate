package de.thm.iem.CarGate.mvc.controller.gameobjectController.effects;

import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public class SpikeEffect implements IEffectable {

    private GameObject gameObject;

    @Override
    public void playEffect(ICar car) {
        car.setSpeed(car.getSpeed() / 2);
    }

    @Override
    public GameObject getGameObject() {
        return gameObject;
    }

    @Override
    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
