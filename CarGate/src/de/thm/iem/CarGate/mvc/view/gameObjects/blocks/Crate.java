package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Vector;

/**
 * Created by Dustin on 06.10.14.
 */
public class Crate extends GameObject{

    public Crate(Point location, Vector<GameObject> gameObjects){
        super(location, ImageIO.read(Crate.class.getResource("../resources/gameObjects/blocks/Crate.png")), gameObjects);

    }



}
