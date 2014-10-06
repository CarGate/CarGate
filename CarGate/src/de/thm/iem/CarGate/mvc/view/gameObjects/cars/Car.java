/**
 * CarGate von Yannick Lamprecht 980340
 * Erstellt am 10.09.2014 15:24:06
 * Restricted under Creative Commons CC by-nc-sa
 */
package de.thm.iem.CarGate.mvc.view.gameObjects.cars;

import de.thm.iem.CarGate.enums.Direction;
import de.thm.iem.CarGate.interfaces.ICar;
import de.thm.iem.CarGate.mvc.view.gameObjects.GameObject;

import java.awt.*;
import java.util.Vector;

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
	 * @param gameObjects
	 */
	protected Car(Point location,Vector<GameObject> gameObjects, Direction defaultDirection) {
		super(location, Car.class.getName(),null, gameObjects);
		this.direction=defaultDirection;
        this.speed = 1;
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
	 * @see de.thm.iem.CarGate.interfaces.ICar#getSpeed()
	 */
	@Override
    public int getSpeed() {
        return this.speed;
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
	 * @see de.thm.iem.CarGate.interfaces.ICar#setSkin(java.awt.Image)
	 */
	@Override
	public void setSkin(Image skin) {
		this.skin = skin;
        this.repaint();
    }


	@Override
    public void repaint() {
        //this.gameObjects.stream().filter( e -> e.getLocation().equals(new Vector2Integer(getLocation()).add(direction).to))

        this.setLocation(new Point(this.getLocation().x
                + this.direction.getVelocity2I().getX() * speed, this
				.getLocation().y
				+ this.direction.getVelocity2I().getY()
				* speed));
        super.repaint();
    }

    private Car getCar(){
        return this;
    }

    private void changeDirection(){


    }

    /**
     * Method to detect a collision, this method is startet at construction.
     */

    public void collsionDetection(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    for (GameObject gobj : gameObjects) {
                        if (getBounds().intersects(gobj.getBounds())) {
                            switch(gobj.getName()){
                                case "Crate": changeDirection();break;
                                case "Container": changeDirection();break;
                                case "IcePlane": gobj.getIEffectable().playEffect(getCar());break;
                                case "Spike": gobj.getIEffectable().playEffect(getCar()); ;break;
                                case "Nitro": gobj.getIEffectable().playEffect(getCar());;break;
                            }
                        }

                    }
                }

            }
        }).start();

    }

}
