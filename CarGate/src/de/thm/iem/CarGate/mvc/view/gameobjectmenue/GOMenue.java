package de.thm.iem.CarGate.mvc.view.gameobjectmenue;

import de.thm.iem.CarGate.mvc.controller.menu.gameobjectmenue.ButtonListener;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by yannicklamprecht on 05.10.14.
 */
public class GOMenue extends JPanel {

    private FlowLayout flowLayout;
    private Vector<GameObject> objects;


    public GOMenue() {
        objects = new Vector<>();


        //try {
        //  objects.add(new IcePlane(this.getLocation(), objects));
        //objects.add(new Spike(this.getLocation(), objects));

        // } catch (IOException e) {

        //}


        for (GameObject c : objects) {


            c.addMouseListener(new ButtonListener(objects));
            flowLayout.addLayoutComponent(c.getName(), c);
            this.add(c);
        }


        flowLayout = new FlowLayout(FlowLayout.LEFT);

        this.setLayout(flowLayout);


        this.setVisible(true);
    }


}
