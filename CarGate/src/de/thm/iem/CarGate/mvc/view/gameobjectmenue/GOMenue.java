package de.thm.iem.CarGate.mvc.view.gameobjectmenue;

import de.thm.iem.CarGate.mvc.controller.menu.gameobjectmenue.ButtonListener;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;
import de.thm.iem.CarGate.mvc.view.gameObjects.blocks.IcePlane;
import de.thm.iem.CarGate.mvc.view.gameObjects.blocks.Spike;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by yannicklamprecht on 05.10.14.
 */
public class GOMenue extends JPanel {

    private FlowLayout flowLayout;
    private Vector<JButton> buttons;
    private Vector<Class<? extends GameObject>> classes;


    public GOMenue() {
        classes = new Vector<>();
        buttons = new Vector<>();


        classes.add(IcePlane.class);
        classes.add(Spike.class);


        for (Class<? extends GameObject> c : classes) {

            JButton jb = new JButton(c.getSimpleName());
            jb.addActionListener(new ButtonListener(c));
            buttons.add(jb);
        }


        flowLayout = new FlowLayout(FlowLayout.LEFT);

        this.setLayout(flowLayout);

        for (JButton availeableObject : buttons) {
            flowLayout.addLayoutComponent(availeableObject.getName(), availeableObject);
            this.add(availeableObject);
        }

        this.setVisible(true);
    }


}
