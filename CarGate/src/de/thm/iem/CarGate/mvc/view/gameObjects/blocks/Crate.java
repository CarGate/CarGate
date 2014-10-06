package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.interfaces.IPlaceable;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;
import java.util.Vector;

/**
 * Created by Dustin on 06.10.14.
 */
public class Crate extends GameObject{

    public Crate(Point location, Vector<GameObject> gameObjects){
        super(location, Crate.class.getName(),null, gameObjects);

    }



}
