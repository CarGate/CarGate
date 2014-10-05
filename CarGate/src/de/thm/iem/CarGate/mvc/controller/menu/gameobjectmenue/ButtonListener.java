package de.thm.iem.CarGate.mvc.controller.menu.gameobjectmenue;

import de.thm.iem.CarGate.lib.FktLib;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yannicklamprecht on 05.10.14.
 */
public class ButtonListener implements ActionListener {

    private Class<? extends GameObject> prefab;

    public ButtonListener(Class<? extends GameObject> prefab) {
        this.prefab = prefab;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        FktLib.frage(null, "Test", prefab.getName());

    }
}
