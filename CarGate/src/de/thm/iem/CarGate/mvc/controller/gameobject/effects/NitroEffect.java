package de.thm.iem.CarGate.mvc.controller.gameobject.effects;

import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public class NitroEffect implements IEffectable {

    private GameObject gameObject;

    @Override
    public void playEffect(ICar car) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                car.setSpeed(15 / 10);
                try {
                    Thread.sleep(1000 * 60);
                } catch (InterruptedException e) {
                }
                car.setSpeed(2 / 3);

            }
        }).start();

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
