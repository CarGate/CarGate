/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 29.09.2014 01:06:18
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

import de.thm.iem.CarGate.interfaces.IVector;

/**
 * @author yannicklamprecht
 */
public class Vector2Long implements IVector<Long> {

    private Long x;
    private Long y;


    public Vector2Long(long x, long y) {
        this.x = Long.valueOf(x);
        this.y = Long.valueOf(y);
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#getX()
     */
    @Override
    public Long getX() {

        return x;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#getY()
     */
    @Override
    public Long getY() {
        return y;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#add(de.thm.iem.CarGate.interfaces.IVector)
     */
    @Override
    public IVector<Long> add(IVector<Long> IVector) {
        return new Vector2Long(this.x + IVector.getX(), this.y + IVector.getY());
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#subtract(de.thm.iem.CarGate.interfaces.IVector)
     */
    @Override
    public IVector<Long> subtract(IVector<Long> IVector) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#dot(de.thm.iem.CarGate.interfaces.IVector)
     */
    @Override
    public Long dot(IVector<Long> IVector) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#scalarMul(java.lang.Object)
     */
    @Override
    public IVector<Long> scalarMul(Long scalar) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#length()
     */
    @Override
    public Long length() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see de.thm.iem.CarGate.interfaces.IVector#normalize()
     */
    @Override
    public IVector<Long> normalize() {
        // TODO Auto-generated method stub
        return null;
    }


}
