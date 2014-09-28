/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 12.09.2014 14:04:30
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.lib;

import java.awt.Point;

/**
 * @author yannicklamprecht
 *
 */
public class Vector2I {
	
	private int x;
	private int y;
	
	
	
	public Vector2I(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public Vector2I(Point p){
		this(p.x,p.y);
	}
	
	public Point toPoint(){
		return new Point(x, y);
	}
	
	public Vector2I add(Vector2I vector){
		return new Vector2I(this.x+vector.x, this.y+vector.y);
	}
	public Vector2I subtract(Vector2I vector){
		return new Vector2I(this.x-vector.x, this.y-vector.y);
	}
	public double dot(Vector2I vector){
		return this.x+vector.x+this.y+vector.y;
		
	}
	
	public Vector2I scalarMul(int scalar){
		return new Vector2I(this.x*scalar, this.y*scalar);
	}
	
	public int length(){
		return (int) Math.sqrt(x*x + y*y);
	}
	
	public Vector2I normalize(){
		return new Vector2I(this.x/this.length(), this.y/this.length());
	}
	

}
