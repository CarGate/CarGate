package de.thm.iem.CarGate.mvc.model;

import de.thm.iem.CarGate.interfaces.IHighscorePlayer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by yannicklamprecht on 07.10.14.
 */
@XmlRootElement
public class DataHolder {


    @XmlElement
    private ArrayList<HighscorePlayer> players;


    public DataHolder() {
        players = new ArrayList<>();
    }


    public String[] getUsers(String name) {


        ArrayList<String> user_points = new ArrayList<>();

        for (IHighscorePlayer p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                user_points.add(p.getName() + " " + p.getPoints());
            }
        }
        return user_points.toArray(new String[user_points.size()]);

    }


    public String[] getUsers() {

        ArrayList<String> user_points = new ArrayList<>();

        for (HighscorePlayer p : players) {
            user_points.add(p.getName() + " " + p.getPoints());
        }


        return user_points.toArray(new String[user_points.size()]);


    }


        /*
    * (non-Javadoc)
    *
    * @see
    * de.thm.iem.CarGate.interfaces.IHighscoreHandler#addHighscorePlayer(de
    * .thm.iem.CarGate.interfaces.IHighscorePlayer)
    */

    public void addHighscorePlayer(HighscorePlayer player) {
        this.players.add(player);
    }

}
