/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:45:00
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

/**
 * @author yannicklamprecht
 *
 */
public class Vector2D {
	private double x;
	private double y;
	
	
	public Vector2D(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public Vector2D add(Vector2D vector){
		return new Vector2D(this.x+vector.x, this.y+vector.y);
	}
	public Vector2D subtract(Vector2D vector){
		return new Vector2D(this.x-vector.x, this.y-vector.y);
	}
	public double dot(Vector2D vector){
		return this.x+vector.x+this.y+vector.y;
		
	}
	
	public Vector2D scalarMul(double scalar){
		return new Vector2D(this.x*scalar, this.y*scalar);
	}
	
	public double length(){
		return Math.sqrt(x*x + y*y);
	}
	
	public Vector2D normalize(){
		return new Vector2D(this.x/this.length(), this.y/this.length());
	}
}
