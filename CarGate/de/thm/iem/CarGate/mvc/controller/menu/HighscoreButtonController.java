/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:34:02
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.view.menu.HighscorePanel;

/**
 * @author yannicklamprecht
 *
 */
public class HighscoreButtonController implements ActionListener{
	
	
	
	private IHighscoreHandler handler;
	
	
	public HighscoreButtonController(IHighscoreHandler handler){
		this.handler=handler;
	}
	

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		HighscorePanel p = new HighscorePanel(handler);
		p.setVisible(true);
	}

}
