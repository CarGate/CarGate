/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:20:45
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.model;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.interfaces.IHighscorePlayer;

/**
 * @author yannicklamprecht
 *
 */
public class HighscoreHandler implements IHighscoreHandler {

	private List<IHighscorePlayer> players;

	/**
	 * 
	 */
	public HighscoreHandler() {
		this.players = new Vector<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.thm.iem.CarGate.interfaces.IHighscoreHandler#getHighscorePlayers()
	 */
	@Override
	public List<IHighscorePlayer> getHighscorePlayers() {
		return new Vector<>(players);
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
				new String[] { "Name", "Punkte" }) {
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
}
