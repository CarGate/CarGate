/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:53:23
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yannicklamprecht
 *
 */
public class AboutListener implements ActionListener{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Ein Projekt von \n Christian Kretzschmar, Yannick Lamprecht \n Dustin Leibnitz, Thorsten Otto", "About us", JOptionPane.INFORMATION_MESSAGE);

    }

}
