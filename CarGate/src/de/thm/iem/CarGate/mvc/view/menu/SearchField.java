/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 23.09.2014 17:25:29
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.menu;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.controller.menu.highscorepanel.AddListener;
import de.thm.iem.CarGate.mvc.controller.menu.highscorepanel.SearchButtonListener;
import de.thm.iem.CarGate.mvc.model.HighScorePanelModel;

import javax.swing.*;
import java.awt.*;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class SearchField extends JPanel{
	
	private JTextField searchfield;
	private JButton searchButton;
	private JButton addButton;
	private FlowLayout searchLayOut;


    public SearchField(IHighscoreHandler handler, HighScorePanelModel model, JList highscoreTable) {

        this.searchLayOut = new FlowLayout(FlowLayout.LEFT);
		
		this.searchButton = new JButton(model.getSearch());
		this.addButton = new JButton("add");
		this.searchfield = new JTextField();
		
		
		this.searchfield.setColumns(20);
		
		
		this.searchLayOut.addLayoutComponent("Text", this.searchfield);
		this.searchLayOut.addLayoutComponent("searchButton", this.searchButton);
		this.searchLayOut.addLayoutComponent("addButton", this.addButton);

        this.searchButton.addActionListener(new SearchButtonListener(handler, this.searchfield, highscoreTable));
        this.addButton.addActionListener(new AddListener(handler, this.searchfield, highscoreTable));
		
		this.setLayout(this.searchLayOut);
		
		this.add(searchfield);
		this.add(searchButton);
		this.add(addButton);
		
		this.setEnabled(true);
	}
	

}
