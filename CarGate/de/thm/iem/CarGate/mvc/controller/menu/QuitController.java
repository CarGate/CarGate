/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 16:43:48
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import de.thm.iem.CarGate.lib.FktLib;


/**
 * @author yannicklamprecht
 *
 */
public class QuitController implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int option = FktLib
				.beenden(null, "Beenden?", "Wollen Sie das Spiel beenden");
		if (option == JOptionPane.YES_OPTION) {
			System.exit(0);
		}else if(option== JOptionPane.CANCEL_OPTION){
			return;
		}
	}

}
