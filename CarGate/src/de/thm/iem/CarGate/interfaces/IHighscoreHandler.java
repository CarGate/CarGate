/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 15.09.2014 17:23:55
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

import de.thm.iem.CarGate.mvc.model.HighscorePlayer;

/**
 * @author yannicklamprecht
 *
 */
public interface IHighscoreHandler {
	

    /**
	 * Adds a new Highscoreplayer to database
	 * @param player
	 */
    public void addHighscorePlayer(HighscorePlayer player);

    /**
     * Loads the highscore from file
     */
    public void save();

    /**
     * Save the highscore to file
     */
    public void load();


    /**
     * @return an array of names and points
     */
    public String[] getUsers();


    /**
     * @param name searched name
     * @return a array of name an points
     */
    public String[] getUsers(String name);

}
