/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 14:04:30
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

import de.thm.iem.CarGate.interfaces.IVector;

import java.awt.*;

/**
 * @author yannicklamprecht
 */
public class Vector2Integer implements IVector<Integer> {

    private Integer x;
    private Integer y;

    public Vector2Integer(int x, int y) {
        this.x = Integer.valueOf(x);
        this.y = Integer.valueOf(y);
    }

    public Vector2Integer(Point p) {
        this(p.x, p.y);
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Point toPoint() {
        return new Point(x, y);
    }

    public IVector<Integer> add(IVector<Integer> IVector) {
        return new Vector2Integer(this.x + IVector.getX(), this.y + IVector.getY());
    }

    public IVector<Integer> subtract(IVector<Integer> IVector) {
        return new Vector2Integer(this.x - IVector.getX(), this.y - IVector.getY());
    }

    public Integer dot(IVector<Integer> IVector) {
        return Integer.valueOf(this.x + IVector.getX() + this.y + IVector.getY());
    }

    public IVector<Integer> scalarMul(Integer scalar) {
        return new Vector2Integer(this.x * scalar, this.y * scalar);
    }

    public Integer length() {
        return Integer.valueOf((int) Math.sqrt(x * x + y * y));
    }

    public IVector<Integer> normalize() {
        return new Vector2Integer(this.x / this.length(), this.y / this.length());
    }


}
