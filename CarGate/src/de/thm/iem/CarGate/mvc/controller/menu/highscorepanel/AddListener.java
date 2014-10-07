/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 23.09.2014 17:48:52
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu.highscorepanel;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.model.HighscorePlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yannicklamprecht
 *
 */
public class AddListener implements ActionListener{
	
	
	
	private IHighscoreHandler handler;
	private JTextField searchText;
    private JList table;

	/**
	 * @param handler
	 * @param searchfield
	 * @param highscoreTable
	 */
	public AddListener(IHighscoreHandler handler, JTextField searchfield,
                       JList highscoreTable) {
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

            table.setListData(handler.getUsers());
            table.repaint();
		}

	}
	

}
