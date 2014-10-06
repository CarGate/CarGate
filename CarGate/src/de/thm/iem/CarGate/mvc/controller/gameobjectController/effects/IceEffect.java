package de.thm.iem.CarGate.mvc.controller.gameobjectController.effects;

import de.thm.iem.CarGate.enums.Direction;
import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.interfaces.IEffectable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public class IceEffect implements IEffectable{

    private GameObject gameObject;

    public IceEffect(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void playEffect(ICar car) {
        car.setSpeed(10);
        car.setDirection(Direction.random());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                car.setSpeed(1);
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
