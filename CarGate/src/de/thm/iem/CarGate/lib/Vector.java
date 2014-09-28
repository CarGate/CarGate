/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 29.09.2014 01:02:11
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

/**
 * @author yannicklamprecht
 *
 */
public interface Vector<T> {

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
	 * Vector addition
	 * @param vector that will be added
	 * @return a new instance of Vector<T>
	 */
	public Vector<T> add(Vector<T> vector);
	
	/**
	 * Vector subtraction
	 * @param vector that will be subtracted
	 * @return a new instance of Vector<T>
	 */
	public Vector<T> subtract(Vector<T> vector);
	
	/**
	 * Dot product equation to vector length
	 * @param vector the vector that will be multiplied
	 * @return the product as a scalar
	 */
	public T dot(Vector<T> vector);
	
	/**
	 * multiplies with a scalar number
	 * 
	 * @param scalar multiplier of vector
	 * @return a new vector multiplied by scalar
	 */
	public Vector<T> scalarMul(T scalar);
	
	/**
	 * the length of the vector if normalized length is 1
	 * 
	 * @return T the length of the vector 
	 */
	public T length();
	
	/**
	 * will shorten the vector to length 1
	 * 
	 * Vector(3,4,5) -> (3,4,5)/√(3^2+4^2+5^2) = 
	 * 
	 * 
	 * @return
	 */
	public Vector<T> normalize();
	
	
}
