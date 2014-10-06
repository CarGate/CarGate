package de.thm.iem.CarGate.mvc.view.gameObjects.blocks;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;
import java.util.Vector;

/**
 * Created by Dustin on 06.10.14.
 */
public class Container extends GameObject {

    public Container (Point location, Vector<GameObject> gameObjects){
        super(location, Container.class.getName(),null, gameObjects);


    }


}
