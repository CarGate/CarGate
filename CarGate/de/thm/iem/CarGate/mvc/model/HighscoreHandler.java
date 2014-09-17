/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 16.09.2014 18:20:45
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.model;

import java.util.List;
import java.util.Vector;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import de.thm.iem.CarGate.interfaces.IHighscoreHandler;
import de.thm.iem.CarGate.interfaces.IHighscorePlayer;

/**
 * @author yannicklamprecht
 *
 */
public class HighscoreHandler implements IHighscoreHandler, TableModel {

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
	 * @see de.thm.iem.CarGate.interfaces.IHighscoreHandler#getModel()
	 */
	@Override
	public TableModel getModel() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.thm.iem.CarGate.interfaces.IHighscoreHandler#getModel(java.lang.String
	 * )
	 */
	@Override
	public TableModel getModel(String userName) {
		// TODO Add Searchengine
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		return this.players.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		return 2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getColumnName(int)
	 */
	@Override
	public String getColumnName(int columnIndex) {
		return columnIndex == 0 ? "Name" : "Punkte";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getColumnClass(int)
	 */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return columnIndex == 0 ? String.class : long.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#isCellEditable(int, int)
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return columnIndex == 0 ? this.players.get(rowIndex).getName()
				: this.players.get(rowIndex).getPoints();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
	 */
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (aValue instanceof String) {
			((HighscorePlayer) this.players.get(rowIndex))
					.setName((String) aValue);
		} else {
			((HighscorePlayer) this.players.get(rowIndex))
					.setPoints((long) aValue);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.table.TableModel#addTableModelListener(javax.swing.event.
	 * TableModelListener)
	 */
	@Override
	public void addTableModelListener(TableModelListener l) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.table.TableModel#removeTableModelListener(javax.swing.event
	 * .TableModelListener)
	 */
	@Override
	public void removeTableModelListener(TableModelListener l) {
	}

}
