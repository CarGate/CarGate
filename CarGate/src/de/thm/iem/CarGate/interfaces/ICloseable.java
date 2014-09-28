/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:18:37
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

/**
 * @author yannicklamprecht
 *
 */
public interface ICloseable {
	
	/**
	 * Set the close state of an object, like a door, trapdoor, gardendoor
	 * @param isClosed
	 */
	public void setClosed(boolean isClosed);
	
	/**
	 * Displays the close state of an object implementing the interface
	 * 
	 * @return isClosed
	 */
	public boolean isClosed();
	

}
