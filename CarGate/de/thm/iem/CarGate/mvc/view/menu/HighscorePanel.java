/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 17:15:04
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.menu;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.controller.menu.highscorepanel.SearchButtonListener;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class HighscorePanel extends JDialog{
	
	
		private JTextField searchfield;
		private JButton searchButton;
		
		
		private JTable highscoreTable;
		private IHighscoreHandler handler;
		
		
		private JButton back;
	
		
		
		
	public HighscorePanel(IHighscoreHandler handler){
		
		this.handler=handler;
		
		this.setModal(true);
		highscoreTable = new JTable(this.handler.getModel());
		
		this.searchButton.addActionListener(new SearchButtonListener(this.handler, searchfield, highscoreTable));
		
		
		
		this.setVisible(true);
	}

}
