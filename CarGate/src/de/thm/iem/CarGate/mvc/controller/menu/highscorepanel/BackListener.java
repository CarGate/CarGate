/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 18.09.2014 18:24:37
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu.highscorepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

/**
 * @author yannicklamprecht
 *
 */
public class BackListener implements ActionListener {

	private JDialog current;

	/**
	 * 
	 */
	public BackListener(JDialog current) {
		this.current = current;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.current.setVisible(false);
		this.current.dispose();
	}
	

}
