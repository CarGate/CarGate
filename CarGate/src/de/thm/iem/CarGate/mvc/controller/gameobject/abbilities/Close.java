package de.thm.iem.CarGate.mvc.controller.gameobject.abbilities;

import de.thm.iem.CarGate.interfaces.ICloseable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public class Close implements ICloseable {

    private GameObject gameObject;
    private Image closedImage;
    private Image openedImage;

    private boolean isClosed = true;

    public Close(Image closedImage, Image openedImage) {
        this.closedImage = closedImage;
        this.openedImage = openedImage;
    }

    @Override
    public boolean isClosed() {
        return isClosed;
    }

    @Override
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
        this.gameObject.setSkin(isClosed ? closedImage : openedImage);
    }

    @Override
    public GameObject getGameObject() {
        return this.gameObject;
    }

    @Override
    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
