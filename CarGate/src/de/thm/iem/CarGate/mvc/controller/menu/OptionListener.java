/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:53:00
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu;

import de.thm.iem.CarGate.lib.FktLib;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yannicklamprecht
 *
 */
public class OptionListener implements ActionListener{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

        FktLib.frage(null, "????", "Soll da noch etwas hin?");
    }


}
