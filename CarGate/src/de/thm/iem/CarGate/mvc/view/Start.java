/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:10:12
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view;

import de.thm.iem.CarGate.mvc.model.HighscoreHandler;
import de.thm.iem.CarGate.mvc.view.menu.Menu;

import javax.swing.*;
import java.awt.*;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Start extends JFrame {


    private BorderLayout bl = new BorderLayout(3, 3);

    private Menu controlls;
	private CarField gameField;


    public Start() {
        this.setBounds(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.controlls = new Menu(new HighscoreHandler());
		this.bl.addLayoutComponent(controlls, BorderLayout.NORTH);
		this.add(controlls);
		
		this.gameField = new CarField();
		this.bl.addLayoutComponent(gameField, BorderLayout.CENTER);
		this.add(gameField);
		
		this.controlls.setVisible(true);
		this.gameField.setVisible(true);
		
		
		this.setLayout(bl);
		this.setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args){
        new Start();
    }


}
