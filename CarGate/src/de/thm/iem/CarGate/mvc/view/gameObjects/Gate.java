package de.thm.iem.CarGate.mvc.view.gameObjects;

import de.thm.iem.CarGate.interfaces.ICloseable;
import de.thm.iem.CarGate.mvc.controller.gameobjectController.abbilities.Close;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;


/**
 * Created by yannicklamprecht on 07.10.14.
 */
public class Gate extends GameObject {

    private ICloseable closeable;

    public Gate(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, gameObjects);
        this.setImage(ImageIO.read(getClass().getClassLoader().getResource("de/thm/iem/CarGate/resources/view/gameObjects/Gate_closed.png")));
        this.closeable = new Close(ImageIO.read(getClass().getClassLoader().getResource("de/thm/iem/CarGate/resources/view/gameObjects/Gate_closed.png")), ImageIO.read(this.getClass().getResource("../resources/gameObjects/Gate_opened.png")));
        this.closeable.setGameObject(this);
    }
}
