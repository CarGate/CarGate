/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 11.09.2014 17:04:49
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view;

import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;
import de.thm.iem.CarGate.mvc.view.gameObjects.Gate;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class CarField extends JPanel{


    public final static CarField field = new CarField();

    private Vector<GameObject> gameObjects;


    private Thread gameThread;
	private GameThread runnable;
	
	
	public CarField(){
        this.setBounds(0, 0, 200, 200);
        this.gameObjects = new Vector<GameObject>();
        this.runnable = new GameThread(this, 20);


        this.gameThread = new Thread(this.runnable);
		
        //this.gameObjects.add(new Gate(new Point(this.getBounds().x - 20, this.getBounds().y / 2), gameObjects));
        //this.add(new Gate(new Point(this.getBounds().x - 20, this.getBounds().y / 2), gameObjects));
        

        this.setVisible(true);
    }

    public Thread getGameThread(){
        return gameThread;
    }


}
