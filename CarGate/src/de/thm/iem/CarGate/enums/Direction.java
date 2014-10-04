/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:30:43
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.enums;

import de.thm.iem.CarGate.lib.Vector2Double;
import de.thm.iem.CarGate.lib.Vector2Integer;

/**
 * @author yannicklamprecht
 *
 */
public enum Direction {
    NORTH(new Vector2Double(0, -1), new Vector2Integer(0, -1)), SOUTH(new Vector2Double(0, 1), new Vector2Integer(0, 1)), EAST(new Vector2Double(1, 0), new Vector2Integer(1, 0));

    private Vector2Double direction2D;
    private Vector2Integer direction2I;

    /**
     * Creates an VectorDirection
	 * @param direction2D
	 * @param direction2I
	 */
    Direction(Vector2Double direction2D, Vector2Integer direction2I) {
        this.direction2D = direction2D;
        this.direction2I=direction2I;
	}

	/**
     *
     * @return a random direction
     */
    public static Direction random() {
        return Direction.values()[(int) (Math.random() * 3 - 1)];
    }

	/**
     *
     * @return vector as a double
     */
    public Vector2Double getVelocity2D() {
        return direction2D;
    }
	
	/**
     *
     * @return vector as an int
     */
    public Vector2Integer getVelocity2I() {
        return direction2I;
    }
	
}
