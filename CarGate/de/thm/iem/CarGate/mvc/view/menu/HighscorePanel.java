/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 17:15:04
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.menu;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.controller.menu.highscorepanel.BackListener;
import de.thm.iem.CarGate.mvc.model.HighScorePanelModel;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class HighscorePanel extends JDialog {

	private BorderLayout bl;
	private HighScorePanelModel model;

	private SearchField search;

	private JTable highscoreTable;
	private IHighscoreHandler handler;

	private JButton back;

	private int width = Toolkit.getDefaultToolkit().getScreenResolution() * 5;
	private int height = Toolkit.getDefaultToolkit().getScreenResolution() * 7;

	public HighscorePanel(IHighscoreHandler handler) {

		this.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width / 2
				- width / 2, Toolkit.getDefaultToolkit().getScreenSize().height
				/ 2 - height / 2, width, height);

		this.model = new HighScorePanelModel();

		this.handler = handler;

		this.bl = new BorderLayout(1, 1);


		this.setModal(true);

		highscoreTable = new JTable(this.handler.toStringTableModel());

		this.search = new SearchField(handler, model, highscoreTable);
		this.back = new JButton(model.getBackButton());

		this.back.addActionListener(new BackListener(this));


		this.bl.addLayoutComponent(back, BorderLayout.SOUTH);
		this.bl.addLayoutComponent(highscoreTable, BorderLayout.CENTER);
		this.bl.addLayoutComponent(search, BorderLayout.NORTH);

		this.setLayout(bl);

		this.add(search);
		this.add(back);
		this.add(highscoreTable);

		this.setVisible(true);
	}

}
