package de.thm.iem.CarGate.mvc.controller.gameobjectController.abbilities;

import de.thm.iem.CarGate.interfaces.ICloseable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.image.BufferedImage;

/**
 * Created by yannicklamprecht on 04.10.14.
 */
public class Close implements ICloseable {

    private GameObject gameObject;
    private BufferedImage closedImage;
    private BufferedImage openedImage;

    private boolean isClosed = true;

    public Close(BufferedImage closedImage, BufferedImage openedImage) {
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
