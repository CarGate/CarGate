/**
 * StandartDialoge von Yannick Lamprecht 980340
 * Erstellt am 12.11.2013 14:41:29
 * Fällt unter Öffentliche Lizenz
 * Es darf als Quelle für Ideen genutzt werden,
 * aber 1 zu 1 Kopien des SourceCodes sind nicht erlaubt.
 */
package de.thm.iem.CarGate.lib;

/**
 * Für konsistente Werte der FileChooser–, Fenster-Buttons 
 * 
 * @author yannicklamprecht
 */
public enum BUTTON_ACTIONS {
	  YES_BUTTON(1) , OK_BUTTON(1) , NO_BUTTON(2) ,
	  CANCEL_BUTTON(3) , X_BUTTON(3) , OPEN_BUTTON(4) , 
	  SAVE_BUTTON(5) ;

	  private int value ;

	  private BUTTON_ACTIONS(int wert) {
	    value = wert ;
	  }
	  public int getValue() { return value ; }
}
