/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 15.09.2014 17:23:55
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import javax.swing.table.TableModel;
import java.util.List;

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
	 * Returns a 2D Stringarray to fit the Jtable
	 * @return
	 */
	public TableModel toStringTableModel();
	
	/**
	 * Returns a 2D Stringarray to fit the Jtable by playername
	 * @return
	 */
	public TableModel toStringTableModel(String playername);

    /**
     * Loads the highscore from file
     */
    public void save();

    /**
     * Save the highscore to file
     */
    public void load();

}
