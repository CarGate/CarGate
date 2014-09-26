/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:30:43
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.enums;

import de.thm.iem.CarGate.lib.Vector2D;
import de.thm.iem.CarGate.lib.Vector2I;

/**
 * @author yannicklamprecht
 *
 */
public enum Direction {
	NORTH(new Vector2D(0, -1),new Vector2I(0, -1)),SOUTH(new Vector2D(0, 1),new Vector2I(0, 1)),EAST(new Vector2D(1, 0),new Vector2I(1, 0));
	
	private Vector2D direction2D;
	private Vector2I direction2I;
	
	Direction(Vector2D direction2D,Vector2I direction2I){
		this.direction2D=direction2D;
	}
	
	public Vector2D getVelocity2D(){
		return direction2D;
	}
	public Vector2I getVelocity2I(){
		return direction2I;
	}
	
	public static Direction random(){
		return Direction.values()[(int)(Math.random()*3-1)];
	}
}
