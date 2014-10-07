package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Dustin on 06.10.14.
 */
public class Crate extends GameObject{

    public Crate(Point location, Vector<GameObject> gameObjects) throws IOException {
        super(location, gameObjects);
        this.setImage(ImageIO.read(getClass().getClassLoader().getResource("de/thm/iem/CarGate/resources/view/gameObjects/blocks/Crate.png")));
    }
}
