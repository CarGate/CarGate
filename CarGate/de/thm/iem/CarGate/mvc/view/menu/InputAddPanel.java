/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 18.09.2014 17:59:40
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.menu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.thm.iem.CarGate.interfaces.IPushable;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class InputAddPanel extends JPanel {

	private JTextField inputField;
	private JButton acceptButton;
	private IPushable setableContent;
	private FlowLayout layOut;

	public InputAddPanel(String buttonLabel, String defaultText,
			IPushable setableContent) {
		this.layOut = new FlowLayout(FlowLayout.LEFT, 2, 2);
		this.inputField = new JTextField(defaultText);

		this.acceptButton = new JButton(buttonLabel);
		this.setableContent = setableContent;
		this.acceptButton.addActionListener(new InputPanelListener());

		this.setLayout(layOut);
		this.layOut.addLayoutComponent(inputField.getName(), inputField);
		this.layOut.addLayoutComponent(acceptButton.getName(), acceptButton);

		this.add(inputField);
		this.add(acceptButton);
		this.setVisible(true);
	}

	@Override
	public void setVisible(boolean value) {
		super.setVisible(value);
		this.inputField.setVisible(value);
		this.acceptButton.setVisible(value);

	}

	private class InputPanelListener implements ActionListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent
		 * )
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			setableContent.setString(inputField.getText());
		}
	}

}
