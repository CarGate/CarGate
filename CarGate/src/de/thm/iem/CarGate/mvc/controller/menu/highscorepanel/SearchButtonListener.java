/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:07:05
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.controller.menu.highscorepanel;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author yannicklamprecht
 *
 */
public class SearchButtonListener implements ActionListener {

	private IHighscoreHandler handler;
	private JTextField searchText;
    private JList table;

	public SearchButtonListener(IHighscoreHandler handler,
                                JTextField searchText, JList table) {
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

        if (searchText.getText() != null && !searchText.getText().equalsIgnoreCase("")) {
            table.setListData(handler.getUsers(searchText.getText()));
            table.repaint();
        } else {
            table.setListData(handler.getUsers());
            table.repaint();
        }

	}

}
