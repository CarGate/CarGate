/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:36:18
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yannicklamprecht
 *
 */
public class StartController implements ActionListener{

    private Thread gameThread;

    public StartController(Thread gameThread){
        this.gameThread = gameThread;
    }

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		gameThread.start();
	}

	
}
