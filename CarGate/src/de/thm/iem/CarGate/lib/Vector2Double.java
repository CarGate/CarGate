/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:45:00
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

import de.thm.iem.CarGate.interfaces.IVector;

/**
 * @author yannicklamprecht
 */
public class Vector2Double implements IVector<Double> {
    private Double x;
    private Double y;


    public Vector2Double(double x, double y) {
        this.x = Double.valueOf(x);
        this.y = Double.valueOf(y);
    }

    public Vector2Double(IVector<Double> IVector) {
        this.x = IVector.getX();
        this.y = IVector.getY();
    }


    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public IVector<Double> add(IVector<Double> IVector) {
        return new Vector2Double(this.x + IVector.getX(), this.y + IVector.getY());
    }

    @Override
    public IVector<Double> subtract(IVector<Double> IVector) {
        return new Vector2Double(this.x - IVector.getX(), this.y - IVector.getY());
    }

    @Override
    public Double dot(IVector<Double> IVector) {
        return this.x + IVector.getX() + this.y + IVector.getY();
    }

    @Override
    public IVector<Double> scalarMul(Double scalar) {
        return new Vector2Double(this.x * scalar, this.y * scalar);
    }

    @Override
    public Double length() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public IVector<Double> normalize() {
        return new Vector2Double(this.x / this.length(), this.y / this.length());
    }

}
