/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 15.09.2014 17:23:55
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import java.util.List;

import javax.swing.table.TableModel;

/**
 * @author yannicklamprecht
 *
 */
public interface IHighscoreHandler {
	
	/**
	 *  Returns an copy of the highscoreplayerlist
	 *  e.g. Listing all highscoreplayer
	 * @return
	 */
	public List<IHighscorePlayer> getHighscorePlayers();
	
	/**
	 * Adds a new Highscoreplayer to database
	 * @param player
	 */
	public void addHighscorePlayer(IHighscorePlayer player);
	
	
	/**
	 * Returns a Highscoreplayer by name
	 * @param name of the Highscoreplayer
	 * @return @see IHighscorePlayer
	 */
	public IHighscorePlayer getPlayer(String name);
	
	/**
	 * Returns the HighscorePlayers as a tableModel
	 * needed to display in table
	 * @return
	 */
	public TableModel getModel();
	
	
	/**
	 * 
	 * Returns the HighscorePlayers as a tableModel
	 * needed to display in table filtered by userName
	 * @param userName
	 * @return
	 */
	public TableModel getModel(String userName);

}
