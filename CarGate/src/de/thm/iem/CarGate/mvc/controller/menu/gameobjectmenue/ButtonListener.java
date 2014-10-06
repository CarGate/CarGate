package de.thm.iem.CarGate.mvc.controller.menu.gameobjectmenue;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

/**
 * Created by yannicklamprecht on 05.10.14.
 */
public class ButtonListener implements MouseListener {

    private Vector<GameObject> prefab;

    public ButtonListener(Vector<GameObject> prefab) {
        this.prefab = prefab;
    }


    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
