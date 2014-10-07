/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:20:45
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.model;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yannicklamprecht
 */
public class HighscoreHandler implements IHighscoreHandler {

    private File saveFile = new File("saveFile.xml");
    private FileOutputStream fo;

    private DataHolder dataholder;

    /**
     *
     */
    public HighscoreHandler() {

        this.load();
    }

    @Override
    public void save() {

        try {
            saveFile.createNewFile();

            fo = new FileOutputStream(saveFile);
            JAXB.marshal(dataholder, fo);
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
            dataholder = new DataHolder();
            dataholder.addHighscorePlayer(new HighscorePlayer("dummy", 0));
            this.save();
        } else {
            dataholder = JAXB.unmarshal(saveFile, DataHolder.class);
        }
    }


    @Override
    public void addHighscorePlayer(HighscorePlayer player) {
        dataholder.addHighscorePlayer(player);
        this.save();
    }


    @Override
    public String[] getUsers() {
        return dataholder.getUsers();
    }

    @Override
    public String[] getUsers(String name) {
        return dataholder.getUsers(name);
    }
}
