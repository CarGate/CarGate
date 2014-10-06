/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 13:03:35
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.menu;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.mvc.controller.menu.*;
import de.thm.iem.CarGate.mvc.model.MenuDataHolder;
import de.thm.iem.CarGate.mvc.view.CarField;

import javax.swing.*;
import java.awt.*;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Menu extends JPanel{
	
	private MenuDataHolder labels;
	
	private JMenuBar mainMenu;
	
	private JMenu gameDropdown;
	private JMenuItem start;
	private JMenuItem highscore;
	private JMenuItem quit;

    private JMenuItem options;
    private JMenuItem about;

    private StartController startController;
    private HighscoreButtonController highscoreButtonController;
	private QuitController quitController;
	
	private OptionListener optionsListener;
	private AboutListener aboutListener;
	private FlowLayout fl;
	
	
	private IHighscoreHandler handler;
	
	
	
	
	public Menu( IHighscoreHandler handler){
		this.handler = handler;
		fl = new FlowLayout(FlowLayout.LEFT);
		labels = new MenuDataHolder();
		mainMenu = new JMenuBar();
		mainMenu.setLayout(fl);
		gameDropdown = new JMenu(labels.getGameDropdownLabel());
		start = new JMenuItem(labels.getStartLabel());
		highscore = new JMenuItem(labels.getHighscoreLabel());
		quit = new JMenuItem(labels.getQuitLabel());

        options = new JMenuItem(labels.getOptionLabel());
        about = new JMenuItem(labels.getAboutLabel());


        fl.addLayoutComponent(gameDropdown.getName(), gameDropdown);
        fl.addLayoutComponent(options.getName(), options);
		fl.addLayoutComponent(about.getName(), about);
		
		
		mainMenu.add(gameDropdown);
		gameDropdown.add(start);
		gameDropdown.add(highscore);
		gameDropdown.add(quit);
		
		mainMenu.add(options);
		mainMenu.add(about);
		
		this.add(mainMenu);
		
		
		this.startController = new StartController(CarField.field.getGameThread());
		this.highscoreButtonController = new HighscoreButtonController(this.handler);
		this.quitController = new QuitController();
		
		this.optionsListener = new OptionListener();
		this.aboutListener = new AboutListener();
		
		start.addActionListener(startController);
		highscore.addActionListener(highscoreButtonController);
		quit.addActionListener(quitController);
		
		options.addActionListener(optionsListener);
		about.addActionListener(aboutListener);
		
		start.setVisible(true);
		highscore.setVisible(true);
		options.setVisible(true);
		about.setVisible(true);
		
		this.setVisible(true);
	}
	
	

}
