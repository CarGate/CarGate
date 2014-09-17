/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:18:15
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

/**
 * @author yannicklamprecht
 *
 */
public interface ICollectable {
	public void onCollect(ICar car);
	public void setVisible(boolean isVisible);
}
