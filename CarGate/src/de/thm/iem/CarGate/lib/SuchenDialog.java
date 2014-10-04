/**
 * StandartDialoge von Yannick Lamprecht 980340
 * Erstellt am 11.11.2013 15:51:54
 * Fällt unter Öffentliche Lizenz
 * Es darf als Quelle für Ideen genutzt werden,
 * aber 1 zu 1 Kopien des SourceCodes sind nicht erlaubt.
 */
package de.thm.iem.CarGate.lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Das Search Objekt behandelt in Eingabe eines Suchfeldes
 * 
 * 
 * @author yannicklamprecht
 * 
 */
@SuppressWarnings("serial")
public class SuchenDialog extends JDialog {
	private BorderLayout bl;

	private JPanel lp;
	private JPanel tp;
	private JPanel bp;

	private JLabel searchLabel;
	private JTextField searchField;
	private JButton ok_Button;
	private JButton cancel_Button;

	private BUTTON_ACTIONS action = BUTTON_ACTIONS.CANCEL_BUTTON;

	/**
	 * Der Konstruktor des SuchenDialogs
	 * 
	 * @param f
	 * @param title
	 * @param label
	 * @param ok_button
	 * @param cancel_button
	 */
	public SuchenDialog(Frame f, String title, String label, String ok_button,
			String cancel_button) {
		super(f);
		this.setModal(true);
		this.setTitle(title);
		this.setBounds(0, 0, 255, 120);
		this.setResizable(false);
		this.bl = new BorderLayout(0, 0);

		this.lp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		this.searchLabel = new JLabel(label);
		this.lp.add(searchLabel);

		this.tp = new JPanel(new FlowLayout());
		this.searchField = new JTextField(20);
		this.tp.add(searchField);

		this.bp = new JPanel(new FlowLayout());
		this.ok_Button = new JButton(ok_button);
		this.ok_Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				action = BUTTON_ACTIONS.OK_BUTTON;
				setVisible(false);
			}
		});

		this.cancel_Button = new JButton(cancel_button);
		this.cancel_Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				action = BUTTON_ACTIONS.CANCEL_BUTTON;
				setVisible(false);
			}
		});

		this.bp.add(ok_Button);
		this.bp.add(cancel_Button);

		this.bl.addLayoutComponent(lp, BorderLayout.NORTH);
		this.bl.addLayoutComponent(tp, BorderLayout.CENTER);
		this.bl.addLayoutComponent(bp, BorderLayout.SOUTH);

		this.add(lp);
		this.add(tp);
		this.add(bp);

		this.setLayout(bl);

		this.setVisible(true);

	}

	/**
     * return the searchtext
     * @return searchtext
     */
    public String getSearchText() {
        return (this.searchField.getText() == null) ? "" : this.searchField
                .getText();
    }

    /**
     * Setzt den text der gesucht werden soll
     *
     * @param text
	 */
	public void setSearchText(String text) {
		this.searchField.setText(text);
	}

	/**
     * returns the buttonaction
     * DEFAULT: BUTTON_ACTIONS.CANCEL_BUTTON
     * @return action
     */
	public BUTTON_ACTIONS getButton() {
		return action;
	}
}
