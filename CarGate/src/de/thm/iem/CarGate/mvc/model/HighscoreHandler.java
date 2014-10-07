/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:20:45
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.model;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.interfaces.IHighscorePlayer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 * @author yannicklamprecht
 */
public class HighscoreHandler implements IHighscoreHandler {

    private File saveFile = new File("saveFile.xml");
    private FileOutputStream fo;

    @XmlElement
    private ArrayList<IHighscorePlayer> players;

    /**
     *
     */
    public HighscoreHandler() {

        this.load();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * de.thm.iem.CarGate.interfaces.IHighscoreHandler#getHighscorePlayers()
     */
    @Override
    public ArrayList<IHighscorePlayer> getHighscorePlayers() {
        return new ArrayList<>(players);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * de.thm.iem.CarGate.interfaces.IHighscoreHandler#addHighscorePlayer(de
     * .thm.iem.CarGate.interfaces.IHighscorePlayer)
     */
    @Override
    public void addHighscorePlayer(IHighscorePlayer player) {
        this.players.add(player);
        this.save();
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * de.thm.iem.CarGate.interfaces.IHighscoreHandler#getPlayer(java.lang.String
     * )
     */
    @Override
    public IHighscorePlayer getPlayer(String name) {
        return players.stream().filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst().orElse(new IHighscorePlayer() {

                    @Override
                    public long getPoints() {
                        return 0;
                    }

                    @Override
                    public String getName() {
                        return "Player not found";
                    }
                });
    }

    /*
     * (non-Javadoc)
     *
     * @see de.thm.iem.CarGate.interfaces.IHighscoreHandler#toStringArray()
     */
    @Override
    public TableModel toStringTableModel() {

        String[][] tableList = new String[this.players.size()][2];

        @SuppressWarnings("serial")
        DefaultTableModel model = new DefaultTableModel(tableList,
                new String[]{"Name", "Punkte"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        return model;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * de.thm.iem.CarGate.interfaces.IHighscoreHandler#toStringArray(java.lang
     * .String)
     */
    @Override
    public TableModel toStringTableModel(String playername) {

        List<IHighscorePlayer> copyedList = this.players.stream()
                .filter(e -> e.getName().equalsIgnoreCase(playername))
                .collect(Collectors.toList());


        @SuppressWarnings("serial")
        DefaultTableModel model = new DefaultTableModel(
                new Vector<>(copyedList), new Vector<>(Arrays.asList("Name",
                "Punkte"))) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        return model;
    }

    @Override
    public String[] getUsers() {

        ArrayList<String> user_points = new ArrayList<>();

        for (IHighscorePlayer p : players) {
            user_points.add(p.getName() + " " + p.getPoints());
        }


        return user_points.toArray(new String[user_points.size()]);


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


    @Override
    public void save() {

        try {
            saveFile.createNewFile();

            fo = new FileOutputStream(saveFile);
            JAXB.marshal(players, fo);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }



    }

    @Override
    public void load() {

        if (!saveFile.exists()) {
            try {
                saveFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            players = new ArrayList<>();
            this.addHighscorePlayer(new HighscorePlayer("dummy", 0));
        } else {
            players = (ArrayList<IHighscorePlayer>) JAXB.unmarshal(saveFile, ArrayList.class);
        }


    }
}
