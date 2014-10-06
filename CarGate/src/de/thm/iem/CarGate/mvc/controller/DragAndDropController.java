/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:33:09
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller;

import de.thm.iem.CarGate.mvc.view.CarField;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author yannicklamprecht
 *
 */
public class DragAndDropController implements MouseListener {


    private GameObject data = null;
    private boolean isInCarfield = false;


    public DragAndDropController() {

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() instanceof GameObject) {
            data = (GameObject) e.getSource();
            data.setVisible(false);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (isInCarfield) {
            data.setLocation(e.getLocationOnScreen().getLocation());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof CarField) {
            isInCarfield = true;
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof CarField) {
            isInCarfield = false;
        }
    }
}
