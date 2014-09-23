/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 23.09.2014 17:48:52
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu.highscorepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.model.HighscorePlayer;

/**
 * @author yannicklamprecht
 *
 */
public class AddListener implements ActionListener{
	
	
	
	private IHighscoreHandler handler;
	private JTextField searchText;
	private JTable table;

	/**
	 * @param handler
	 * @param searchfield
	 * @param highscoreTable
	 */
	public AddListener(IHighscoreHandler handler, JTextField searchfield,
			JTable highscoreTable) {
		this.handler = handler;
		this.searchText = searchfield;
		this.table = highscoreTable;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (searchText.getText() != null && searchText.getText() != "") {
			
			handler.addHighscorePlayer(new HighscorePlayer(searchText.getText(), 0));
			
			table.setModel(handler.toStringTableModel(searchText.getText()));
			table.repaint();
		}

	}

}
