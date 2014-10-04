/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 29.09.2014 01:02:11
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.interfaces;

/**
 * @author yannicklamprecht
 *
 */
public interface IVector<T> {

	/**
	 * the horizontal movement
	 * @return x as T
	 */
	public T getX();
	
	/**
	 * the vertical movement
	 * @return y as T
	 */
	public T getY();
	
	
	/**
     * IVector addition
     * @param IVector that will be added
     * @return a new instance of IVector<T>
     */
    public IVector<T> add(IVector<T> IVector);

    /**
     * IVector subtraction
     *
     * @param IVector that will be subtracted
     * @return a new instance of IVector<T>
     */
    public IVector<T> subtract(IVector<T> IVector);

    /**
     * Dot product equation to IVector length
     * @param IVector the IVector that will be multiplied
     * @return the product as a scalar
     */
    public T dot(IVector<T> IVector);

    /**
     * multiplies with a scalar number
	 * 
	 * @param scalar multiplier of vector
	 * @return a new vector multiplied by scalar
     */
    public IVector<T> scalarMul(T scalar);

    /**
     * the length of the vector if normalized length is 1
	 * 
	 * @return T the length of the vector 
	 */
	public T length();
	
	/**
	 * will shorten the vector to length 1
     *
     * IVector(3,4,5) -> (3,4,5)/√(3^2+4^2+5^2) =
     *
     *
	 * @return
     */
    public IVector<T> normalize();


}
