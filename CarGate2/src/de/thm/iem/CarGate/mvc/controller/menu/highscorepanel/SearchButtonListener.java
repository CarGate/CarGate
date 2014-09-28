/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:07:05
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu.highscorepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;

/**
 * @author yannicklamprecht
 *
 */
public class SearchButtonListener implements ActionListener {

	private IHighscoreHandler handler;
	private JTextField searchText;
	private JTable table;

	public SearchButtonListener(IHighscoreHandler handler,
			JTextField searchText, JTable table) {
		this.handler = handler;
		this.searchText = searchText;
		this.table = table;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (searchText.getText() != null && searchText.getText() != "") {
			table.setModel(handler.toStringTableModel(searchText.getText()));
			table.repaint();
		}

	}

}
