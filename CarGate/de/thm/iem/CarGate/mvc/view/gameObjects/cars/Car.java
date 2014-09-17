/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:24:06
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.cars;

import java.awt.Image;
import java.awt.Point;
import java.util.Vector;

import de.thm.iem.CarGate.enums.Direction;
import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

/**
 * @author yannicklamprecht
 *
 */
@SuppressWarnings("serial")
public class Car extends GameObject implements ICar {

	private int speed;
	private Direction direction;

	/**
	 * @param location
	 * @param skin
	 * @param gameObjects
	 */
	protected Car(Point location,Vector<GameObject> gameObjects, Direction defaultDirection) {
		super(location, Car.class.getName(),null, gameObjects);
		this.direction=defaultDirection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.thm.iem.CarGate.interfaces.ICar#setDirection(de.thm.iem.CarGate.enums
	 * .Direction)
	 */
	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.thm.iem.CarGate.interfaces.ICar#setSpeed(double)
	 */
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.thm.iem.CarGate.interfaces.ICar#getSpeed()
	 */
	@Override
	public int getSpeed() {
		return this.speed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.thm.iem.CarGate.interfaces.ICar#setSkin(java.awt.Image)
	 */
	@Override
	public void setSkin(Image skin) {
		this.skin = skin;
		this.update();
	}

	@Override
	public void update() {
		//TODO Implement location checking for moving
		//this.gameObjects.stream().filter( e -> e.getLocation().equals(new Vector2I(getLocation()).add(direction).to))
		
		this.setLocation(new Point(this.getLocation().x
				+ this.direction.getVelocity2I().getX() * speed, this
				.getLocation().y
				+ this.direction.getVelocity2I().getY()
				* speed));
		super.update();
	}

}
