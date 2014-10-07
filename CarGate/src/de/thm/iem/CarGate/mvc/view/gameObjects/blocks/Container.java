package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Dustin on 06.10.14.
 */
public class Container extends GameObject {

    public Container(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, ImageIO.read(Container.class.getResource("../resources/gameObjects/blocks/Container.png")), gameObjects);
    }


}
